import java.util.Scanner;
import java.util.Random;

public class Ex3Lab10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int amount = sc.nextInt();
		String result = numGen(amount);
		System.out.println("Random characters: " + result);
	}

	public static String numGen(int amount)
	{
		Random r = new Random();
		String temp = "";

		for (int i = 0; i < amount; i++)
		{
			char c = (char)(r.nextInt(126));
			temp += c;
		}

		return temp;
	}
}