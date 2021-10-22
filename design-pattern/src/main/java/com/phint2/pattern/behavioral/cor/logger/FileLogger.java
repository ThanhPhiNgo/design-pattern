package com.phint2.pattern.behavioral.cor.logger;

public class FileLogger extends Logger {

	public FileLogger(LogLevel logLevel) {
		super(logLevel);
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("File logger: " + message);
	}
}
