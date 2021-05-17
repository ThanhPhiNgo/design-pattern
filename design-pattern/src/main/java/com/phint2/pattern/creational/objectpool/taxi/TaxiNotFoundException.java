package com.phint2.pattern.creational.objectpool.taxi;

public class TaxiNotFoundException extends RuntimeException {

	public TaxiNotFoundException(String message) {
		System.out.println(message);
	}
}
