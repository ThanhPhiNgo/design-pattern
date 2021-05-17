package com.phint2.pattern.creational.objectpool.taxi;

public class TaxiApp {

	private static final int NUM_OF_CLIENT = 9;

	public static void main(String[] args) {

		TaxiPool taxiPool = new TaxiPool();
		for (int i = 1; i <= NUM_OF_CLIENT; i++) {
			Runnable client = new ClientThread(taxiPool);
			Thread thread = new Thread(client);
			thread.start();
		}
	}
}
