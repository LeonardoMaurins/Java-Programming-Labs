import java.util.Scanner;

public class Max{
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		System.out.println("Please input the series of numbers");
		System.out.println("Input -1 to break the loop");
		double input = 0;
		double highest = 0;
		do{
			input = scr.nextDouble();
			if(input > highest){
				highest = input;
			}
			System.out.println("Current max is " + highest);
		}while(input != -1);
		System.out.println("The largest number was: " + highest);
	}
}