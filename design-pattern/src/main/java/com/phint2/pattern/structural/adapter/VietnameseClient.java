package com.phint2.pattern.structural.adapter;

public class VietnameseClient {

	public static void main(String[] args) {

		VietnameseTarget client = new TranslatorAdapter(new EnglishAdaptee());
		client.send("Xin chào");

	}
}
