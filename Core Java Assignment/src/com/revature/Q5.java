package com.revature;

public class Q5 {
	
	public String substringUntilIndex(String s, int index) {

		if (index < 0) {
			return "Error: The index is smaller than zero";
		} else if (index >= s.length()) { 
			return s;
		} else {
			
			switch(index) {
			case 0: System.out.println("The substring of \"" + s + "\" from its first until its " + index + "st character is ");
			        break;
			case 1: System.out.println("The substring of \"" + s + "\" from its first until its " + index + "nd character is");
	        		break;
			default: System.out.println("The substring of \"" + s + "\" from its first until its " + index + "th character is");
			}
			
			String substringUntilIndex = "";
			for (int i=0; i<index; ++i) {
				substringUntilIndex = substringUntilIndex + s.charAt(i);
			};
			return substringUntilIndex;
		}
	}
	
}
