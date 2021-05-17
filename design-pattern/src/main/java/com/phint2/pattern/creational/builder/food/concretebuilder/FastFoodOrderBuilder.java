package com.phint2.pattern.creational.builder.food.concretebuilder;

import com.phint2.pattern.creational.builder.food.builder.OrderBuilder;
import com.phint2.pattern.creational.builder.food.product.order.Order;
import com.phint2.pattern.creational.builder.food.product.type.BreadType;
import com.phint2.pattern.creational.builder.food.product.type.OrderType;
import com.phint2.pattern.creational.builder.food.product.type.SauceType;
import com.phint2.pattern.creational.builder.food.product.type.VegetableType;

public class FastFoodOrderBuilder implements OrderBuilder {

	private OrderType orderType;
	private BreadType breadType;
	private SauceType sauceType;
	private VegetableType vegetableType;

	@Override
	public OrderBuilder orderType(OrderType orderType) {
		this.orderType = orderType;
		return this;
	}

	@Override
	public OrderBuilder orderBread(BreadType breadType) {
		this.breadType = breadType;
		return this;
	}

	@Override
	public OrderBuilder orderSauce(SauceType sauceType) {
		this.sauceType = sauceType;
		return this;
	}

	@Override
	public OrderBuilder orderVegetable(VegetableType vegetableType) {
		this.vegetableType = vegetableType;
		return this;
	}

	@Override
	public Order build() {
		return new Order(orderType, breadType, sauceType, vegetableType);
	}
}
