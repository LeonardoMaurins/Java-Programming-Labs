import java.util.Scanner;

public class CounterDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		double total = 0;
		while(counter < 5)
		{
			System.out.print("Enter amount spent today: ");
			double amountPerDay = sc.nextDouble();
			total += amountPerDay;
			counter++;
		}
		System.out.println(total);
		sc.close();
	}
}