package com.phint2.pattern.structural.proxy.virtual;

public class Client {

	public static void main(String[] args) {
		System.out.println("Init proxy image: ");
		ProxyImage proxyImage = new ProxyImage("abc.com");

		System.out.println("---");
		System.out.println("Call real service 1st: ");
		proxyImage.showImage();

		System.out.println("---");
		System.out.println("Call real service 2nd: ");
		proxyImage.showImage();
	}
}
