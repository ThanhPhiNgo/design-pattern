package com.phint2.pattern.creational.abstractfactory;

public class PlasticTable implements Table {
	@Override
	public void create() {
		System.out.println("Create plastic table");
	}
}
