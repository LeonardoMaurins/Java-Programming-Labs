import java.util.Scanner;

public class MyShop2
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter the number of pads: ");
		int numberOfPads = input.nextInt();
		System.out.print("Enter the number of pens: ");
		int numberOfPens = input.nextInt();
		System.out.print("Enter the price of a pad: ");
		double priceOfPad = input.nextDouble();
		System.out.print("Enter the price of a pen: ");
		double priceOfPen = input.nextDouble();

		double totalValuePads = (numberOfPads * priceOfPad);
		System.out.printf("The total value of pads: " + totalValuePads);
		double totalValuePens = (numberOfPens * priceOfPen);
		System.out.printf("The total value of pens: " + totalValuePens);
		double totalValueStock = (totalValuePads + totalValuePens);
		System.out.printf("The total value of the entire stock: " + totalValueStock);


	}
}