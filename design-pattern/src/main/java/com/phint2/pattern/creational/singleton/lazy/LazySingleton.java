package com.phint2.pattern.creational.singleton.lazy;

// Good in single thread
public class LazySingleton {

	private static LazySingleton INSTANCE;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {

		if (null == INSTANCE) {
			INSTANCE = new LazySingleton();
		}
		return INSTANCE;
	}
}
