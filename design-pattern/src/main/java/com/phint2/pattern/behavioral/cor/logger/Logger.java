package com.phint2.pattern.behavioral.cor.logger;

public abstract class Logger {

	protected LogLevel logLevel;
	protected Logger nextLogger; // The next Handler in the chain

	public Logger(LogLevel logLevel) {
		this.logLevel = logLevel;
	}

	// Set the next logger to make a list/chain of Handlers.
	public Logger setNext(Logger nextLogger) {
		this.nextLogger = nextLogger;
		return nextLogger;
	}

	public void log(LogLevel severity, String message) {
		if (this.logLevel.getLevel() <= severity.getLevel()) {
			writeMessage(message);
		}
		if (nextLogger != null) {
			nextLogger.log(severity, message);
		}
	}

	protected abstract void writeMessage(String message);
}
