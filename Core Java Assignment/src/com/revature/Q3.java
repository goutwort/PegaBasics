package com.revature;

public class Q3 {
	
	public String reverse(String s){
		System.out.println("Reversing the string " + "\"" + s + "\"");
		char[] oldChars = s.toCharArray();
		char[] newChars = s.toCharArray();

		int i=0;
		do {
			char dummy = oldChars[i];
			newChars[i] = oldChars[s.length()-i-1];
			newChars[s.length()-i-1] = dummy;
			++i;
		} while (i< s.length()-i-1);
		
		return new String(newChars);
	}
}