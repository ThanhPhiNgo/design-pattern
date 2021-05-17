package com.phint2.pattern.structural.bridge;

public class SavingAccount implements Account {

	@Override
	public void openAccount() {
		System.out.println("Saving Account");
	}
}
