package com.phint2.pattern.creational.abstractfactory;

public class PlasticFactory extends FurnitureAbstractFactory {

	@Override
	public Chair createChair() {
		return new PlasticChair();
	}

	@Override
	public Table createTable() {
		return new PlasticTable();
	}
}
