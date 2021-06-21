import java.util.Scanner;

public class Average{
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		System.out.println("Please insert the numbers:");
		double number = 0;
		double total = 0;
		int count = 0;
		do{
			number = scr.nextDouble();
			total += number;
			count++;
			System.out.println("Average: " + (total / count));
		}while(scr.hasNextDouble());
		System.out.println("The input was not a number");
	}
}