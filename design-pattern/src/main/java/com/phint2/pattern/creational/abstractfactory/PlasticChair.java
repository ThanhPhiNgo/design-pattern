package com.phint2.pattern.creational.abstractfactory;

public class PlasticChair implements Chair {

	@Override
	public void create() {
		System.out.println("Create plastic chair");
	}
}
