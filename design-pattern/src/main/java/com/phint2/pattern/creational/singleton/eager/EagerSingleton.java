package com.phint2.pattern.creational.singleton.eager;

public class EagerSingleton {

	public static final EagerSingleton INSTANCE = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
}
