/*2. The first method takes in 2 values representing the number of days worked in a month and the pay rate, and it returns the amount earned that month
The second method takes in a number and prints a hollow square. (I couldn't get it to come out as hollow)*/

import java.util.Scanner;
public class Ex2{
   public static void main(String[]args){

	   Scanner scan = new Scanner (System.in);
	   //first method
	   System.out.println("Enter days worked and pay rate: ");
	   double daysWork = scan.nextDouble();
	   double payRate = scan.nextDouble();

	   //invoke first method
	   System.out.println(monthlyWage(daysWork,payRate));
	   System.out.println(monthlyWage(5, 18.50));
	   System.out.println(monthlyWage(25, 100));


	   //second method
	   System.out.print("Enter Integer: ");
	   int square = scan.nextInt();

	   //invoke second method


    }
    //since a double and int would give me an error of "possible lossy conversion" I used 2 doubles
	public static double monthlyWage(double x, double y){
		double answer;
		answer = (x * y);
		return answer;
	}

}