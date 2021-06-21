import java.util.Scanner;

public class SumOfIntegers
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter First number: ");
		int number1 = input.nextInt();
		System.out.print("Enter Second number: ");
		int number2 = input.nextInt();
		System.out.print("Enter Third number: ");
		int number3 = input.nextInt();

		System.out.printf("First Number: %2d%n", number1);
		System.out.printf("Second Number: %d%n", number2);
		System.out.printf("Third Number: %2d%n", number3);
	}
}