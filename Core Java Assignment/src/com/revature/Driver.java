package com.revature;

public class Driver {
	public static void main(String[] args) {
		
		System.out.println("Running ...");
	    
	    Q1 q1 = new Q1();
		int[] numberList = {1,0,5,6,3,2,3,7,9,8,4};
		printNumberList(q1.sort(numberList));
	    
	    
	    Q2 q2 = new Q2();
	    printNumberList(q2.fibonacci(25));
	    
	    Q3 q3 = new Q3();
	    String magnesiumPhrase = "The heart needs magnesium and Omega-3 acids.";
	    System.out.println("The reverse of this is: \"" + q3.reverse(magnesiumPhrase) + "\"");
	    
	    
	    Q4 q4 = new Q4();
	    int number = 12;
	    System.out.println("The factorial of " + number + " is " + q4.factorial(number));
	    
	    String omegaAcidsPhrase = "Omega-3 acids are contained in salmon and in nuts";
	    Q5 q5 = new Q5();
	    int index = 12;
	    System.out.println("\"" + q5.substringUntilIndex(omegaAcidsPhrase, index) + "\"");
		
		
	}
	
	public static void printCharacterList(char[] characterList) {
		String s = new String(characterList);
		System.out.println(s);
	}
	
	public static void printNumberList(int[] integerList) {
		String s = "";
		if (integerList.length>0) {
			s = s + integerList[0];
			for (int i =1; i<integerList.length; ++i) {
				s = s + "," + integerList[i];
			}
		}
		
    	System.out.println(s);
	}
	
}
