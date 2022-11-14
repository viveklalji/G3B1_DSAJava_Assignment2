package com.greatLearning.client;

import java.util.Scanner;

import com.greatLearning.service.FloorConstruction;

public class MainDriver {

	public static void main(String[] args) {
		int inputArray[];
		int numOfFloors;
		Scanner sc = new Scanner(System.in);
		FloorConstruction floor = new FloorConstruction();

		System.out.println("enter the number of floors");
		numOfFloors = sc.nextInt();

		inputArray = new int[numOfFloors];

		for (int i = 0; i < numOfFloors; i++) {
			System.out.println("Enter the floor size given on day: " + (i + 1));
			inputArray[i] = sc.nextInt();
			System.out.println();
		}

		if (numOfFloors > 0) {
			floor.highestFloor(inputArray, numOfFloors);
			floor.constructionOrder(inputArray, numOfFloors);
		} else {
			System.out.println("No construction order generated as size = " + numOfFloors);
		}

		sc.close();

	}
}
