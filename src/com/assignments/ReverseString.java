package com.assignments;

// Write a Java Program to reverse a string 
// without using String inbuilt function.

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "123";
		
		StringBuilder str1 = new StringBuilder();
		
		str1.append(str);
		
		str1 = str1.reverse();
		
		System.out.println(str1);

	}

}
