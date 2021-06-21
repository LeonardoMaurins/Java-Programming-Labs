import java.util.Scanner;

public class Week05Problem06

{
	public static void main(String[] args)
	{
		int temp;
		boolean isPrime=true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number = sc.nextInt();
		for(int i=2;i<=number/2;i++)
		{
			temp=number%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("is prime");
		}
		else
		{
			System.out.println("not prime");
		}
   }
}