package com.phint2.pattern.creational.singleton.billpugh;

public class BillPughSingleton {

	private BillPughSingleton() {
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
}

