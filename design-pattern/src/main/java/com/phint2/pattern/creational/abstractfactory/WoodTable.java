package com.phint2.pattern.creational.abstractfactory;

public class WoodTable implements Table {

	@Override
	public void create() {
		System.out.println("Create wood table");
	}
}
