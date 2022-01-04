package com.revature;

public class Q2 {
	
	public int[] fibonacci(int length) {
		
		System.out.println("Showing the first " + length + " Fibonacci numbers");	
		
		int[] numberList = new int[length];
		
		numberList[0] = 1;
		numberList[1] = 2;
		for (int i =2; i<length; ++i) {
			numberList[i] = numberList[i-2] + numberList[i-1];
		}
		
		return numberList;
	}
}
