package com.phint2.pattern.creational.factorymethod;

public class Client {

	public static void main(String[] args) {
		System.out.println("Client is running Factory Method pattern!\n");

		Bank bank  = BankFactory.getBank(BankType.VIB);
		System.out.println("Bank selected: " + bank.getBankName());
	}
}
