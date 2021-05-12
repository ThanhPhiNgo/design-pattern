package com.phint2.pattern.creational.abstractfactory;

public class Client {

	public static void main(String[] args) {

		System.out.println("Client is running Abstract Factory pattern!\n");

		FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.WOOD);
		Chair chair = factory.createChair();
		chair.create();

		Table table = factory.createTable();
		table.create();
	}
}
