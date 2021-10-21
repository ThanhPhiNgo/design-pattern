package com.phint2.pattern.behavioral.cor.logger;

public class ConsoleLogger extends Logger {

	public ConsoleLogger(LogLevel logLevel) {
		super(logLevel);
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Console logger: " + message);
	}
}
