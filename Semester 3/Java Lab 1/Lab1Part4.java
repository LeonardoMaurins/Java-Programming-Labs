import java.util.Scanner;

public class Lab1Part4 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age: ");
		double number = sc.nextDouble();
		System.out.println("Half your age is: " + halfMyAge(number));

		System.out.print("Enter your first name: ");
		String name = sc.next();
		System.out.print("Enter your surname: ");
		String surname = sc.next();

		System.out.println("Name reverse: " + printMyNameInReverse(name, surname));
	}

	public static double halfMyAge(double number){
			double num = (number/2);
			return num;
	}

	public static String printMyNameInReverse(String name, String surname) {
		String reverseA = new StringBuffer(name).reverse().toString();
		String reverseB = new StringBuffer(surname).reverse().toString();
		String sentence = reverseA + " " + reverseB;
		return sentence;
	}
}