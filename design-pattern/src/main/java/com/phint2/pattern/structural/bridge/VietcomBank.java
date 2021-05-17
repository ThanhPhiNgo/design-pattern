package com.phint2.pattern.structural.bridge;

public class VietcomBank extends Bank {

	public VietcomBank(Account account) {
		super(account);
	}

	@Override
	public void openAccount() {
		System.out.print("Open your account at Vietcombank is a ");
		account.openAccount();
	}
}
