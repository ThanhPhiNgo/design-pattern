package com.phint2.pattern.structural.facade;

public class PaymentService {

	public void paymentByPaypal() {
		System.out.println("Payment by Paypal");
	}

	public void paymentByCreditCard() {
		System.out.println("Payment by Credit Card");
	}

	public void paymentByEBankingAccount() {
		System.out.println("Payment by EBanking Account");
	}

	public void paymentByCash() {
		System.out.println("Payment by Cash");
	}
}
