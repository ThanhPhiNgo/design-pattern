package com.phint2.pattern.creational.builder.bank;

public class Client {

	public static void main(String[] args) {

		BankAccount newAccount = new BankAccount
				.BankAccountBuilder("PhiNT2", "999999999999")
				.withEmail("contact.phint2@gmail.com")
				.wantNewsletter(true)
				.build();

		System.out.println(newAccount);
	}
}
