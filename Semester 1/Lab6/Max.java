import java.util.Scanner;

public class Max
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		double max = sc.nextDouble();
		System.out.print("Enter a value: ");

		while(sc.hasNextDouble())
		{
			System.out.print("Enter a value: ");
			double value = sc.nextDouble();
			if (max < value)
			{
				max = value;
			}
		}
		System.out.println("Max value: " + max);
		sc.close();
	}
}
