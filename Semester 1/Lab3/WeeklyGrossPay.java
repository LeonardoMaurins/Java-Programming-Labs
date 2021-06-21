import java.util.Scanner;

public class WeeklyGrossPay
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter daily pay rate: ");
		double dailypay = input.nextDouble();

		System.out.print("Enter days worked: ");
		int daysworked = input.nextInt();

		System.out.printf("Pay rate: %18.2f%n", dailypay);
		System.out.printf("Days worked: %10d%n", daysworked);

		double grosspay = (dailypay * daysworked);
		System.out.printf("Gross pay for the week: %10.2f%n", grosspay);
	}
}