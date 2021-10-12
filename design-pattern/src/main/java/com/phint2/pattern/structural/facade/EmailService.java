package com.phint2.pattern.structural.facade;

public class EmailService {

	public void sendEmail(String mailTo) {
		System.out.println("Sending an email to " + mailTo);
	}
}
