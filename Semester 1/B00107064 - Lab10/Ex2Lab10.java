import java.util.Scanner;

public class Ex2Lab10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print( "Enter Something: ");
		String inputtedString = sc.nextLine();
		printContainsCar(inputtedString);

		printNumericalVal(inputtedString);
		printNumericalVal("CArCarcaR");
	}//Main
		//1st method
		public static void printContainsCar(String str)
		{
			if(str.contains("car"))
			{
				System.out.println( "It contains \"car\"");
			}
			else
			{
				System.out.println( "It does NOT contains \"car\"");
			}
		}

		public static void printNumericalVal(String str)
		{
			for(int i = 0; i < str.length(); i++)
			{
				char c = str.charAt(i);
				System.out.print((int)c + " ");
			}
			System.out.println();
		}

}