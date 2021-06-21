import java.util.Scanner;

public class Average
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		double total = 0;
		System.out.print("Enter some double values or anything else to exit: ");
		while(sc.hasNextDouble())
		{
			double value = sc.nextDouble();
			total = total + value;
			counter++;
		}
		if (counter == 0)
		{
			System.out.println("You did not enter any values");
		}
		else
		{
			System.out.println("Average: " + total/counter);
		}
		sc.close();
	}
}
