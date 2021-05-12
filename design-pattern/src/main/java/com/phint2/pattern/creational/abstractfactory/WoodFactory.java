package com.phint2.pattern.creational.abstractfactory;

public class WoodFactory extends FurnitureAbstractFactory {
	@Override
	public Chair createChair() {
		return new WoodChair();
	}

	@Override
	public Table createTable() {
		return new WoodTable();
	}
}
