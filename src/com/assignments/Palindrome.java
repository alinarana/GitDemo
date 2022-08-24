package com.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello";
		String rev ="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println(s+" is Palindrome String");
		}
		else
		{
			System.out.println(s+" is not a Palindrome String");
		}

	}

}
