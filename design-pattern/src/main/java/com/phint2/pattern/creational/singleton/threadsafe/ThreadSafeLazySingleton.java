package com.phint2.pattern.creational.singleton.threadsafe;

public class ThreadSafeLazySingleton {

	private static volatile ThreadSafeLazySingleton INSTANCE;

	private ThreadSafeLazySingleton() {
	}

	public static synchronized ThreadSafeLazySingleton getInstance() {

		if (null == INSTANCE) {
			INSTANCE = new ThreadSafeLazySingleton();
		}
		return INSTANCE;
	}
}
