package com.phint2.pattern.creational.abstractfactory;

public class WoodChair implements Chair {

	@Override
	public void create() {
		System.out.println("Create wood chair");
	}
}
