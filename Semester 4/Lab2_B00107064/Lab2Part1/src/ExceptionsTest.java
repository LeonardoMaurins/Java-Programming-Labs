import java.util.Scanner;

public class ExceptionsTest {

	public static void main(String[] args) {
		
		try {
				Scanner sc = new Scanner(System.in);
			
				int value = 8;
				System.out.print("Choose a number to divide 8: ");
				value /= sc.nextInt();
				System.out.println("Answer: " + value);
				
				sc.close();
			}
		
			catch (ArithmeticException e) {
			System.out.println("You input an incorrect value here!");
			e.printStackTrace();
			}
		
			finally {
				System.out.println("Finally has been called. Leonardo Maurins");
			} 
	}

}
