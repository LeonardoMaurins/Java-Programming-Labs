package application;

import java.util.Scanner;
import mathematics.MathHelper;

public class Application {

	private static Scanner sc;

	/**
	 * @param value: The int value that's input by the user which is sent to MathHelper and returned factorial'd
	 */
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.print("Enter a value to get the factorial of it: ");
		int value = sc.nextInt();
		System.out.println("The factorial of " + value + " is: " + MathHelper.factorial(value));
	}

}
