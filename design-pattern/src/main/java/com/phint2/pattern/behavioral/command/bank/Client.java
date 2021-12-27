package com.phint2.pattern.behavioral.command.bank;

public class Client {

	public static void main(String[] args) {

		Account account = new Account("ntphi");

		Command open = new OpenAccount(account);
		Command close = new CloseAccount(account);

		BankApp bankApp = new BankApp(open, close);
		bankApp.clickOpenAccount();
		bankApp.clickCloseAccount();

	}
}
