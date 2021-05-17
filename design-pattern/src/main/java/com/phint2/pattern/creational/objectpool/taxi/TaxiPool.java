package com.phint2.pattern.creational.objectpool.taxi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class TaxiPool {

	private static final int EXPIRED_TIME_IN_MILLISECOND = 1000;
	private static final int NUMBER_OF_TAXI = 5;

	private final List<Taxi> available = Collections.synchronizedList(new ArrayList<>());
	private final List<Taxi> inUse = Collections.synchronizedList(new ArrayList<>());

	private final AtomicInteger count = new AtomicInteger(0);
	private final AtomicBoolean waiting = new AtomicBoolean(false);

	private Object getLockObject = new Object();
	private Object releaseLockObject = new Object();

	public Taxi getTaxi() {

		synchronized (getLockObject) {
			if (!available.isEmpty()) {
				Taxi taxi = available.remove(0);
				inUse.add(taxi);
				return taxi;
			}

			if (count.get() == NUMBER_OF_TAXI) {
				this.waitingUntilTaxiAvailable();
				return this.getTaxi();
			}

			Taxi taxi = this.createTaxi();
			inUse.add(taxi);
			return taxi;
		}

	}

	public void release(Taxi taxi) {

		synchronized (releaseLockObject) {
			System.out.println(taxi.getName() + " is free");
			inUse.remove(taxi);
			available.add(taxi);
		}
	}

	private Taxi createTaxi() {

		waiting(200);
		Taxi taxi = new Taxi("Taxi " + count.incrementAndGet());
		System.out.println(taxi.getName() + " is created");
		return taxi;
	}

	private void waitingUntilTaxiAvailable() {

		if (waiting.get()) {
			waiting.set(false);
			throw new TaxiNotFoundException("No taxi available");
		}

		waiting.set(true);
		waiting(EXPIRED_TIME_IN_MILLISECOND);
	}

	private void waiting(long numberOfMillSecond) {
		try {
			TimeUnit.MILLISECONDS.sleep(numberOfMillSecond);
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}
}
