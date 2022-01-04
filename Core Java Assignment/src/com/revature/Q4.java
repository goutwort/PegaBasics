package com.revature;

public class Q4 {
	
	public int factorial(int number) {
		int factorial=1;
		switch(number) {
		case 0: System.out.println("There is no factorial of negative numbers"); factorial=0; break;
		default: if (number>12) {
				System.out.println("The number is too big.");
				factorial = -1;
			} else {
				for (int i=1; i<=number;++i) {
		        	 factorial = factorial*i;
		        }
			}
		}
		return factorial;
	}

}
