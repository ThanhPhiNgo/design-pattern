package com.phint2.pattern.structural.facade;

public class SmsService {

	public void sendSMS(String mobilePhone) {
		System.out.println("Send an message to " + mobilePhone);
	}
}
