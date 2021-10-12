package com.phint2.pattern.structural.facade;

public class Client {

	public static void main(String[] args) {
		ShopFacade.getInstance().buyProductByCashWithFreeShipping("thanhphi.designpattern@gmail.com");
		ShopFacade.getInstance()
				.buyProductByPaypalWithStandardShipping("thanhphi.designpattern@gmail.com", "0909090909");
	}
}
