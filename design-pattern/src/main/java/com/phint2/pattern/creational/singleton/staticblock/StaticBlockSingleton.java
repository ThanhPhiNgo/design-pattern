package com.phint2.pattern.creational.singleton.staticblock;

public class StaticBlockSingleton {

	private static final StaticBlockSingleton INSTANCE;

	static {
		try {
			INSTANCE = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occurred in creating singleton instance");
		}
	}

	private StaticBlockSingleton() {
	}

	public static StaticBlockSingleton getInstance() {
		return INSTANCE;
	}
}
