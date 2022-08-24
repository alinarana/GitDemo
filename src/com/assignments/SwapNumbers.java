package com.assignments;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int first = 10;
        int second = 20;
        System.out.println("Before swap");
        System.out.println("First value:"+first);
        System.out.println("Second value:"+second);
        
        int x = first;
        first = second;
        second = x;
        System.out.println("After swap");
        System.out.println("First value:"+first);
        System.out.println("Second value:"+second);

	}

}
