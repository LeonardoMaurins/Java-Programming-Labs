import java.util.Scanner;

public class Week05Problem02

{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 26: ");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++)
		{
			System.out.println((char)(i+'A'));
		}
	}
}
