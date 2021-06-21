package com.maurins.testUtil;

import com.maurins.util.*;

/**
 * @Class TestStringUtility: Prints two lines of values for ASCII conversion it gets from another class within a different package.
 */

public class TestStringUtility {

	public static void main(String[] args) {
		System.out.println("GetSumOfAsciiValues return value: " + StringUtility.getSumOfAcsiiValues("Maurins"));
		System.out.println("getProductOfAsciiValues return value: " + StringUtility.getProductOfAsciiValues("Maurins"));
	}

}
