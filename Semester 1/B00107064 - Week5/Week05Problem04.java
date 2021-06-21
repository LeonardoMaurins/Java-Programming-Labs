import java.util.Scanner;

public class Week05Problem04

{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a username: ");
		String username = sc.next();
		System.out.print("Enter a password: ");
		String password = sc.next();

		if(username.equals("admin") && password.equals("qwerty"))
		{
			System.out.println("login valid");
		}
		else
		{
			System.out.println("invalid");
		}
	}
}