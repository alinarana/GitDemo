package com.assignments;

import java.util.ArrayList;

public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Honda");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Toyota");
		cars.add("Chevy");
		
		// for loop
		System.out.println("For Loop:");
		for (int i=0; i<cars.size(); i++)
		{
			System.out.print(cars.get(i) + " ");
		}
		
		
		// while loop
		System.out.println("\n\nWhile Loop:");
		int i=0;
		while (i< cars.size())
		{
			System.out.print(cars.get(i++)+ " ");
		}
		
		// advanced for loop
				System.out.println("\n\nAdvanced For Loop:");
				for (String car : cars)
				{
					System.out.print(car + " ");
				}

	}

}
