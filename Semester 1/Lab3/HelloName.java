import java.util.Scanner;

public class HelloName
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("What's your name? ");
		String name = input.next();
		System.out.println("Hi " + name + ", nice to meet you!!");
	}
}