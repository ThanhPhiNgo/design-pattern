package com.phint2.pattern.structural.flyweight;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/*
 * Client
 * */
public class AppGame {

	private static List<ISoldier> soldiers = new ArrayList<>();

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		createSoldier(5, "Yuri", 1);
		createSoldier(5, "Spy", 1);
		createSoldier(3, "Spy", 3);
		createSoldier(2, "Yuri", 2);
		long endTime = System.currentTimeMillis();
		System.out.println("---");
		System.out.println("Total soldiers made: " + soldiers.size());
		System.out.println("Total time worked: " + Duration.ofMillis(endTime - startTime));
		System.out.println("Total type of soldiers made: " + SoldierFactory.getTotalSoldiers());
	}

	private static void createSoldier(int numberOfSoldier, String soldierName, int numberOfStart) {

		for (int i = 0; i < numberOfSoldier; i++) {
			Context start = new Context("Soldier" + (soldiers.size() + 1), numberOfStart);
			ISoldier soldier = SoldierFactory.createSoldier(soldierName);
			soldier.promote(start);
			soldiers.add(soldier);
		}
	}
}











