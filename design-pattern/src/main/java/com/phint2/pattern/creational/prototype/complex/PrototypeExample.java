package com.phint2.pattern.creational.prototype.complex;

import com.phint2.pattern.creational.prototype.complex.board3.Board3;

public class PrototypeExample {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
//		Board1 chessBoard = new Board1();
//		Board2 chessBoard = new Board2();
		Board3 chessBoard = new Board3();
		long endTime = System.currentTimeMillis();

		System.out.println("Time taken to create a board: " + (endTime - startTime) + " millis");

		chessBoard.print();
	}
}
