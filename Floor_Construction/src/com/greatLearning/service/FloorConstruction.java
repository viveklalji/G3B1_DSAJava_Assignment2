package com.greatLearning.service;

import java.util.PriorityQueue;

public class FloorConstruction {

	PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());

	int highestfloor = 0;

	public void highestFloor(int[] inputArray, int numOfFloors) {

		for (int i = 0; i < numOfFloors; i++) {

			if (highestfloor < inputArray[i])
				highestfloor = inputArray[i];

		}
	}

	public void constructionOrder(int[] inputArray, int numOfFloors) {
		int floorOrder;
		System.out.println("The order of construction is as follows");
		System.out.println();
		for (int i = 0; i < numOfFloors; i++) {

			queue.add(inputArray[i]);
			System.out.println("Day: " + (i + 1));
			System.out.println();
			while (!queue.isEmpty() && (queue.peek() == highestfloor)) {
				floorOrder = queue.remove();
				System.out.print(" " + floorOrder + " ");
				highestfloor = NextHighestFloor(floorOrder, inputArray, numOfFloors);

			}
			System.out.println();
		}
	}

	private int NextHighestFloor(int floorBuilt, int[] inputArray, int numOfFloors) {
		int highest = 0;
		for (int i = 0; i < numOfFloors; i++) {
			if ((inputArray[i] > highest) && (inputArray[i] < floorBuilt)) {
				highest = inputArray[i];
			}
		}
		return highest;
	}

}
