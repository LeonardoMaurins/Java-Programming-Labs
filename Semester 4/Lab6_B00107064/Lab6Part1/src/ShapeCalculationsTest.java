import java.util.Scanner;

public class ShapeCalculationsTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius of a Circle to get the Area: ");
		System.out.println("The Area of that Circle is: " + ShapeCalculations.getAreaOfCircle(sc.nextDouble()));
		
		System.out.print("Enter the Radius of a Circle to get the Circumference: ");
		System.out.println("The Circumference of that Circle is: " + ShapeCalculations.getCircumferenceOfCircle(sc.nextDouble()));
		
		System.out.print("Enter the Radius of a Sphere to get the Surface Area: ");
		System.out.println("The Surface Area of that Sphere is: " + ShapeCalculations.getSurfaceAreaOfSphere(sc.nextDouble()));

		sc.close();
	}

}
