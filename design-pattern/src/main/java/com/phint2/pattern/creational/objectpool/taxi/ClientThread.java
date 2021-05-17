package com.phint2.pattern.creational.objectpool.taxi;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ClientThread implements Runnable {

	private TaxiPool taxiPool;

	public ClientThread(TaxiPool taxiPool) {
		this.taxiPool = taxiPool;
	}

	private static int randInt(int min, int max) {
		return new Random().nextInt((max - min) + 1) + min;
	}

	@Override
	public void run() {
		takeATaxi();
	}

	private void takeATaxi() {

		try {
			System.out.println("New client: " + Thread.currentThread().getName());
			Taxi taxi = taxiPool.getTaxi();

			int serveTime = randInt(2000, 3500);
			TimeUnit.MILLISECONDS.sleep(serveTime);

			taxiPool.release(taxi);
			System.out.println("Served the client: " + Thread.currentThread().getName());

		} catch (TaxiNotFoundException | InterruptedException e) {
			System.out.println(">>>Rejected the client: " + Thread.currentThread().getName());
		}
	}
}
