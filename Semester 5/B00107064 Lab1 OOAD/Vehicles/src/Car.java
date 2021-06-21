// Car extends the Vehicle class
public class Car extends Vehicle {
	
	// Initializes private global variables 
	private double numberOfDoors;

	// Five-argument Constructor
	public Car(
			String colour, String type, 
			String engineSize, double netPrice, double numberOfDoors) {
		
		// Calling the object constructor for the variables below
		super(colour, type, engineSize, netPrice);

		// Throws exception if numberOfDoors is invalid
		if (numberOfDoors < 0.0) { 
			throw new IllegalArgumentException("Car doors must be >= 0.0");
		}
		// Global variables in this class inherit the values passed to this
		// Constructor once it is called from VehicleTest
		this.numberOfDoors = numberOfDoors;
	} 
	
	// set numberOfDoors 
	public void setNumberOfDoors(double numberOfDoors) {
		if ((numberOfDoors < 0.0)) {
			throw new IllegalArgumentException(
					"Number of doors must be > 0");
	}
		this.numberOfDoors = numberOfDoors;
	} 
	
	// return numberOfDoors
	public double getNumberOfDoors() {
		return numberOfDoors;
	}
        
	// return String representation of Car object
	@Override 
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
				super.toString(),
				"Number of Doors: ", getNumberOfDoors());
	} 
} 
