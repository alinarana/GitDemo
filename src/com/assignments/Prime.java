package com.assignments;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 29;
		boolean isPrime = true;
		
		for(int i=2;i<a;i++)
		{ 
			if(a%i==0)
			{
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
		{
			System.out.println(a+ " is a Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}

	}

}
