import java.util.Scanner;

public class Week05Problem03

{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 26: ");
		int num1 = sc.nextInt();
		System.out.print("Enter another numbet between 1 and 26: ");
		int num2 = sc.nextInt();

		System.out.println((char)(num1+'A'-1));

		for(int i = 1; i < num2; i++)
		{
			System.out.println((char)(i+num1+'A'));
		}
	}
}