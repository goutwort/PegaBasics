package com.revature;

public class Q1 {
	
	    public int[] sort(int[] numberList) {
	    outputNumberList(numberList);
	    
    	int i = 0;
    	do {
    		System.out.println("Index: " + i);
    		int j=i+1;
    		while (j<numberList.length) {
    			int currentElement = numberList[i];
    			if (numberList[i] > numberList[j]) {
    				numberList[i] = numberList[j];
    				numberList[j] = currentElement;
    				j=i+1; // Restart
    				break;
    			}
    			++j;
    		}
    		++i;
    	    outputNumberList(numberList);
    	    
    	} while (i<numberList.length);
	    System.out.println("Returning ...");
		return numberList;
    }
	    
	public void outputNumberList(int[] numberList) {
		String numberListAsString = "" + numberList[0];
	    for (int i=1; i<numberList.length; ++i) {
	    	numberListAsString = numberListAsString + "," + numberList[i];
	    }
	    
	    System.out.println("Sorting the number list " + numberListAsString);
	}
}
