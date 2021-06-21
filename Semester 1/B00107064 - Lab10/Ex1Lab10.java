import java.util.Scanner;

public class Ex1Lab10
{
	public static void main(String[] args)
	{
		System.out.println(countOfRs("rememberR") );
		Scanner sc = new Scanner(System.in);
		System.out.println( "1st call of 1st overloaded version: " + countOfRs ("rememberR") );
		System.out.print("Enter smtg: ");
		String input = sc.nextLine();
		System.out.println( "2nd call of 1st overloaded version: " + countOfRs(input) );

		System.out.println ( "1st call of 2nd overloaded version: " + countOfRs("rememberR", 3) ); //2
		sc.nextLine();
		System.out.print("Enter smtg: ");
		String input2 = sc.nextLine();
		System.out.print("Enter the index: ");
		int ind = sc.nextInt();
		System.out.println( "2nd call of 2nd overloaded version: " + countOfRs(input2, ind) );
	}
			///////////////////////////
			//1st Overloaded Method
			public static int countOfRs(String str)
	{
				int count = 0;
				for(int i = 0; i < str.length(); i++)
				{
					char c = str.charAt(i);
					if(c == 'r' || c == 'R')
					{
						count++;
					}//if
				}//for
				return count;
	}//1st
		public static int countOfRs(String str, int ind)
	{
				int count = 0;
				for(int i = ind; i < str.length(); i++)
				{
					char c = str.charAt(i);
					if(c == 'r' || c == 'R')
					{
						count++;
					}//if
			}//for
				return count;
	}//2st
}