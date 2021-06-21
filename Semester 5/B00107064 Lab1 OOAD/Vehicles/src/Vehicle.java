// Vehicle abstract superclass.
public class Vehicle {
	
	// Initializes private global variables  
	private final String colour;
	private final String type;
	private final String engineSize;
	private final double netPrice;

	// Three-argument constructor
	public Vehicle(String colour, String type, 
			String engineSize, double netPrice) {
		this.colour = colour;
		this.type = type;
		this.engineSize = engineSize;
		this.netPrice = netPrice;
	} 

	// Returns colour
	public String getColour() {
		return colour;
	}

	// Returns type
	public String getType() {
		return type;
	}

	// Returns engineSize
	public String getEngineSize() {
		return engineSize;
	}
	
	// Returns netPrice
	public double getNetPrice() {
		return netPrice;
	}
	
	// Returns netPrice VRT at 21%
	public double getNetPriceVRT() {
		return netPrice * 0.21;
	}
	
	// return String representation of Vehicle object
	@Override 
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
				"Colour: ", getColour(), 
				"Type: ", getType(), 
				"Engine Size: ", getEngineSize(), 
				"Net Price: ", getNetPrice(),
				"Net Price VRT @ 21% ", getNetPriceVRT());
	} 
} 