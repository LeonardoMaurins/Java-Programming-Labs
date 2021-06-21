/*Write a method that calculates and returns the balance of an account with a given initial balance and interest rate, after the given number of years.
Invoke this method twice, using user input.  (I can't figure out how to turn this into a method)*/

import java.util.Scanner;
public class Ex3{
    public static void main (String []args){

		Scanner scan = new Scanner(System.in);
		System.out.println("How much is in your account: ");
		double principal = scan.nextDouble(); // initial amount before interest

		System.out.println("How many years would you like to calculate: ");
		int limit = scan.nextInt();
		double amount;// amount on deposit at end of each year
		double rate; // interest rate
		System.out.printf( "%s%20s\n", "Year", "Amount" );


		for (int year = 1; year <= limit; year++ ){
			for(rate = .05; rate <= .10; rate += .01);{
				amount = principal * Math.pow( 1.0 + rate, year );}
		    System.out.printf( "%4d%,20.2f\n", year, amount );
		}//end for
	}//end main
}//end class