import java.util.Scanner;

public class PositiveSumOfIntegers

{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an int: ");
		int num1 = input.nextInt();

		System.out.print("Enter an int: ");
		int num2 = input.nextInt();

		System.out.print("Enter an int: ");
		int num3 = input.nextInt();

		int sum = num1 + num2 + num3;

		if(sum >= 0)
		{
			System.out.println("Sum is: " + sum);
		}
		else
		{
			System.out.println("Sum is negative");
		}
	}
}