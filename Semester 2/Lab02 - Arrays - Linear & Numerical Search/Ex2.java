/*a method which returns the minimum value of an array of integer values.
a method which returns the average of all elements of an array of integer values.*/

import java.util.Scanner;
public class Ex2{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int inputArray[] = {68, 23, 76, 987, 5};

		System.out.println("The minimum value is: " + getMin(inputArray)); //5
		System.out.println("The average value is: " + getAvg(inputArray)); //231
	}

	public static int getMin(int[]inputMin){
		int minValue = inputMin[0];
		for (int i = 0; i < inputMin.length; i++){
		     if (inputMin[i] < minValue){
				 minValue = inputMin[i];}//end if
		}return minValue;
	}

	public static int getAvg(int[]inputAvg){
	    int sum = 0;
	    for(int i=0; i < inputAvg.length; i++){
	        sum = sum + inputAvg[i];}//end for
	    return sum/inputAvg.length;

	}//end method
}//end class

