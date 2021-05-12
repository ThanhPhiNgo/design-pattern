package com.phint2.pattern.creational.factorymethod;

public class BankFactory {

	private BankFactory() {
	}

	public static final Bank getBank(BankType bankType) {

		switch (bankType){
		case MBBANK:
			return new MBBank();
		case VIB:
			return new VIBBank();
		default:
			throw new IllegalArgumentException("This bank type is unsupported!");
		}
	}
}
