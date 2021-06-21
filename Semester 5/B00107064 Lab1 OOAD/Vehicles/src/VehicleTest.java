// Assigns superclass and subclass references to similar variables.
public class VehicleTest {
	
	public static void main(String[] args) {
	// Assigns superclass reference with the passed variable
	Vehicle vehicle = new Vehicle(
			"Blue", "Race", "V8", 93500);   
		
	// Assigns subclass reference with the passed variable
	Car car = new Car(
			"Red", "Hatchback", "V6", 45000, 4);             

	// Assigns subclass reference with the passed variable
	Motorbike motorbike = new Motorbike(
			"White", "Vintage", "200cc", 120000, true);     

	// Was not able to get the following to print due to some errors in the console related to format.
	
	// Invokes toString on the superclass object using the superclass variable
	System.out.printf("%s %s:%n%n%s%n%n", 
			"Call Vehicle's toString with superclass reference",
			"to superclass object", vehicle.toString());
	
	// Invokes toString on the superclass object using the superclass variable
	System.out.printf("%s %s:%n%n%s%n%n", 
			"Call Vehicle's toString with superclass reference",
			"to superclass object", car.toString());
	
	// Invokes toString on the superclass object using the superclass variable
	System.out.printf("%s %s:%n%n%s%n%n", 
			"Call Vehicle's toString with superclass reference",
			"to superclass object", motorbike.toString());
	} 
} 