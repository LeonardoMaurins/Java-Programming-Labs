import java.util.Scanner;

public class Week05Problem01

{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 26: ");
		int i = sc.nextInt();
		System.out.println((char)(i+'A'-1));
	}
}
