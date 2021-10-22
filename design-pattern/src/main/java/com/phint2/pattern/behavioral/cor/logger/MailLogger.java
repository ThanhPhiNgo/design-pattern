package com.phint2.pattern.behavioral.cor.logger;

public class MailLogger extends Logger {

	public MailLogger(LogLevel logLevel) {
		super(logLevel);
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Mail logger: " + message);
	}
}
