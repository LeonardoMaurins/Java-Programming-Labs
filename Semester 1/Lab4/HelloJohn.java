import java.util.Scanner;

public class HelloJohn

{
	public static void main (String[] args)
	{
		Scanner John = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = John.next();

		if(name.equals("John"))
		{
			System.out.println("Hello John!!");
		}
		else
		{
			System.out.println("You're not John!");
		}
	}
}