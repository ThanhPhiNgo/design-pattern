package com.phint2.pattern.structural.adapter;

public class TranslatorAdapter implements VietnameseTarget {

	private EnglishAdaptee adaptee;

	public TranslatorAdapter(EnglishAdaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void send(String words) {

		System.out.println("Reading Words ...");
		System.out.println(words);

		String vietnameseWords = translate(words);

		System.out.println("Sending Words ...");
		adaptee.receive(vietnameseWords);
	}

	private String translate(String vietnameseWords) {
		System.out.println("Translated!");
		return "Hello";
	}

}
