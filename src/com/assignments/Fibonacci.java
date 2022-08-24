package com.assignments;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 9;
		int first = 1, second = 1, t;
	
		System.out.println(first);
		System.out.println(second);
		
		for(int i=3; i<=a; i++)
		{
			t= first+second;
			System.out.println(t);
			first= second;
			second=t;
		}

	}

}
