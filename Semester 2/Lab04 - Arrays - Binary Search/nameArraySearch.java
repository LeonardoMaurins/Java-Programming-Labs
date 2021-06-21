/* Write a program that has the following static methods (ensure that you test them by invoking them in the main method):
-	A method that takes in a variable length array strings representing names, and prints a greeting to each of those names;
-	A method that takes in a variable length array of double values and returns an array containing only the negative values.
(Group Work)*/

import java.util.Arrays;
import java.util.Random;

public class nameArraySearch{
	public static void main(String arg[]){

		String sArr[] = { "Lee", "Rachel", "Jasmine", "Vanessa", "Victor" };
		printGreetings(sArr); //Call on method to print greetings to the following names above

		System.out.println();
		System.out.println();
		System.out.println();

		double dArr[] = createArray(); //Call on double method

		System.out.println();
		System.out.println();
		System.out.println();

		dArr = negativeValues(dArr);
		printArray(dArr);
	}

	/*Create, populate and sort the array(double only)*/
	public static double[] createArray(){

		Random rRand = new Random();  //random number generator

		double dArr[] = new double[rRand.nextInt(20) + 5]; //create an array of a random size

		for(int i = 0; i < dArr.length; i++)//populate the array with random values
			dArr[i] = rRand.nextDouble() * 10;

		for(int i = 0; i < dArr.length; i++) //random amount of numbers negated
			if(i % 2 == 0)
				dArr[i] *= -1;

		dArr[0] = '0';  //add some value to be found
		Arrays.sort(dArr); //sort the array
		return dArr;
	}

	//array of double values and returns an array containing only the negative values
	public static void printArray(double dArr[]) {  //method to print the double array
		for(double d : dArr)
			System.out.printf("%.1f\n", d);
	}

	public static void printGreetings(String sArr[]) {  //Print greetings to names entered in string
		for(String s : sArr) //if the name is in the array
			System.out.println("Greetings, " + s + "!");
	}


	public static double[] negativeValues(double dArr[]){
		int iCounter = 0;

		for(int i = 0; i < dArr.length; i++)
			if(dArr[i] < 0)
				iCounter++;
			else
				break;

		double dCopyArr[] = new double[iCounter];

		for(int i = 0; i < iCounter; i++)
			dCopyArr[i] = dArr[i];

		return dCopyArr;
	}
}