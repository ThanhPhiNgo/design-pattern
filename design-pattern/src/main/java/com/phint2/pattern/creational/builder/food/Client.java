package com.phint2.pattern.creational.builder.food;

import com.phint2.pattern.creational.builder.food.concretebuilder.FastFoodOrderBuilder;
import com.phint2.pattern.creational.builder.food.product.order.Order;
import com.phint2.pattern.creational.builder.food.product.type.BreadType;
import com.phint2.pattern.creational.builder.food.product.type.OrderType;
import com.phint2.pattern.creational.builder.food.product.type.VegetableType;

public class Client {

	public static void main(String[] args) {

		Order order = new FastFoodOrderBuilder()
				.orderType(OrderType.ON_SITE)
				.orderBread(BreadType.FRIED_EGG)
				.orderVegetable(VegetableType.CUCUMBER)
				.build();

		System.out.println(order.toString());
	}
}
