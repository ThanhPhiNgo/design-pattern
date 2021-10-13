package com.phint2.pattern.structural.flyweight;

/*
* Extrinsic State
* */
public class Context {

	private String id;
	private int start;

	public Context(String id, int start) {
		this.id = id;
		this.start = start;
	}

	public String getId() {
		return id;
	}

	public int getStart() {
		return start;
	}
}
