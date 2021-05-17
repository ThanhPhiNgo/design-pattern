package com.phint2.pattern.creational.builder.food.builder;

import com.phint2.pattern.creational.builder.food.product.order.Order;
import com.phint2.pattern.creational.builder.food.product.type.BreadType;
import com.phint2.pattern.creational.builder.food.product.type.OrderType;
import com.phint2.pattern.creational.builder.food.product.type.SauceType;
import com.phint2.pattern.creational.builder.food.product.type.VegetableType;

public interface OrderBuilder {

	OrderBuilder orderType(OrderType orderType);
	OrderBuilder orderBread(BreadType breadType);
	OrderBuilder orderSauce(SauceType sauceType);
	OrderBuilder orderVegetable(VegetableType vegetableType);

	Order build();
}
