import java.util.Scanner;

public class Week05Problem05

{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a username: ");
		String username = sc.next();
		System.out.print("Enter a password: ");
		String password = sc.next();

		if(username.equals("mark") && password.equals("secret"))
		{
			System.out.println("welcome mark");
		}

		else if(username.equals("dave") && password.equals("qwerty"))
		{
			System.out.println("welcome dave");
		}

		else if(username.equals("yvonne") && password.equals("princess"))
		{
			System.out.println("welcome yvonne");
		}

		else
		{
			System.out.println("invalid");
		}
	}
}