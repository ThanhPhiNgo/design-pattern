package com.phint2.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/*
 * Flyweight Factory
 * */
public class SoldierFactory {

	private static final Map<String, ISoldier> soldiers = new HashMap<>();

	private SoldierFactory() {
		throw new IllegalStateException();
	}

	public static synchronized ISoldier createSoldier(String name) {
		ISoldier soldier = soldiers.get(name);
		if (null == soldier) {
			waitForCreateASoldier();
			soldier = new Soldier(name);
			soldiers.put(name, soldier);
		}
		return soldier;
	}

	public static synchronized int getTotalSoldiers() {
		return soldiers.size();
	}

	private static void waitForCreateASoldier() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
