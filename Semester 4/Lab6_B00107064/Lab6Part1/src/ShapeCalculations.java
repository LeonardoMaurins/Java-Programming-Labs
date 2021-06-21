
public class ShapeCalculations {

	private static final double PI = 3.14159;

	//Changed to Area rather than Volume assuming you meant that as you can't get the volume of a circle
	public static double getAreaOfCircle(double circleRadius) {	
		return (Math.pow(circleRadius, 2)*PI);
	}
	
	public static double getCircumferenceOfCircle(double circleRadius) {	
		return (2*circleRadius*PI);
	}
	
	public static double getSurfaceAreaOfSphere(double circleRadius) {	
		return 4*PI*Math.pow(circleRadius, 2);
	}
}
