import java.util.Scanner;

public class SentinelDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int wagesCounter = 0;
		double wagesTotal = 0;
		System.out.print("Enter salary or -1 exit: ");
		double wage = sc.nextDouble();
		while(wage != -1)
		{
			wagesTotal = wagesTotal + wage;
			wagesCounter++;
			System.out.print("Enter salary or -1 exit: ");
			wage = sc.nextDouble();
		}
		System.out.println(wagesTotal/wagesCounter);
		sc.close();
	}
}