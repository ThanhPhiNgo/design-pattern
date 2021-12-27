package com.phint2.pattern.behavioral.command.bank;

public class BankApp {

	private Command openAccount;
	private Command closeAccount;

	public BankApp(Command openAccount, Command closeAccount) {
		this.closeAccount = closeAccount;
		this.openAccount = openAccount;
	}

	public void clickOpenAccount() {
		System.out.println("User click open an account");
		openAccount.execute();
	}

	public void clickCloseAccount() {
		System.out.println("User click close an account");
		closeAccount.execute();
	}
}
