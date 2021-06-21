public class Car{

	private int regNumber = 8536 ;
	private double engineSize = 1.5;
	private String make = "Ford";

	public static void main(String[] args){
		Car Car1 = new Car();
		System.out.println("First Object");
		System.out.println(Car1.make);
		System.out.println(Car1.engineSize);
		System.out.println();

		System.out.println("Second Object");
		Car Car2 = new Car();
		System.out.println(Car2.make);
		System.out.println(Car2.engineSize);
	}
}