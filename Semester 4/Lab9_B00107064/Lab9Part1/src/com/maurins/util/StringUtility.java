package com.maurins.util;

/**
 * @Class StringUtility: Contains two static methods which convert passed strings to ASCII values and returns them.
 * @Method getSumOfAcsiiValues: Takes in a string and returns the ASCII value of each letter summed up.
 * @Method getProductOfAsciiValues: Takes in a string and returns the ASCII value of each letter multiplied by each other.
 */

public class StringUtility{
	
	public static int getSumOfAcsiiValues(String s) {
		int asciiValue = 0;
		
		for(int i=0;i<s.length();i++) {
			asciiValue += (int)s.charAt(i);
		}
	    
		return asciiValue;
	}
	
	public static long getProductOfAsciiValues(String s) {
		long asciiValue = 1;
		
		for(int i=0;i<s.length();i++) {
			asciiValue *= (int)s.charAt(i);
		}
	    
		return asciiValue;
	}

}