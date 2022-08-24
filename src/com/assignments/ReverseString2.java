package com.assignments;

// Write a Java Program to reverse a string 
// without using String inbuilt function reverse().

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "USA";
		
		char chars[] = str.toCharArray(); 
		
		for(int i= chars.length-1; i>=0; i--) {
			System.out.print(chars[i]);
		}
		
		

	}

}
