/*1.	Write a program that has the following 2 methods:
The first method takes in a number and returns the sum of all squares between 1 and that number inclusively if it’s a square).
The second method takes in a number and returns the sum of all its odd digits
- Invoke these methods twice each.*/

import java.util.Scanner;
public class Ex1{
	public static void main (String[]args){

		//first method
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find the sum of all squares");
		int ans = scan.nextInt();
		System.out.println(sumSquare(ans));
		System.out.println(sumSquare(25));//invoke first method
		System.out.println(sumSquare(12));

		//second method
		System.out.println("Please enter a number to find sum of all odd");
		int numSum = scan.nextInt();
		System.out.println(sumOdd(numSum));
		System.out.println(sumOdd(2334));
		System.out.println(sumOdd(12957713));
	}//end main method


    public static int sumSquare(int a){
		int b = 1;
		int sum = 0;

        while(b * b <= a){
	    	sum += b * b;
		    b++;
	    }
	    return sum;
    }//end method 1

	public static int sumOdd(int num){
		int sum = 0;
		num = Math.abs(num);
	  	   while (num != 0){
	  		   if ((num % 10) % 2 != 0){
				   sum = sum + num % 10;}
	  		   num = num / 10;
	  	   }
       return sum;
	}//end method 2
}