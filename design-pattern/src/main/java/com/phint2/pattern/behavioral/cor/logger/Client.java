package com.phint2.pattern.behavioral.cor.logger;

/*
* Chain of Responsibility Pattern Example
* */
public class Client {

	public static void main(String[] args) {

		// Build the chain of responsibility
		Logger logger = AppLogger.getLogger();

		// Handled by ConsoleLogger since the console has a LogLevel of DEBUG
		logger.log(LogLevel.INFO, "Info message");
		logger.log(LogLevel.DEBUG, "Debug message");

		// Handled by ConsoleLogger and FileLogger
		logger.log(LogLevel.ERROR, "Error message");

		// Handled by ConsoleLogger, FileLogger, MailLogger
		logger.log(LogLevel.FATAL, "Fatal message");
	}
}
