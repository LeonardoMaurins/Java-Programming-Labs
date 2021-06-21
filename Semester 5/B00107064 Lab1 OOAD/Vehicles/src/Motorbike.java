// Motorbike extends the Car class
public class Motorbike extends Car {
	
	// Initializes private global variables 
	private double netPrice;
	private boolean carrier;

	// Five-argument Constructor
	public Motorbike(
			String colour, String type, 
			String engineSize, double netPrice, boolean carrier) {
		
		// Calling the object constructor for the variables below
		super(colour, type, engineSize, netPrice, netPrice);
	} 

	// set carrier 
	public void setCarrier(boolean carrier) {
		if ((carrier != true || carrier != false)) {
			throw new IllegalArgumentException(
					"You must either have true or false for a carrier");
	}
		this.carrier = carrier;
	} 
	
	// return carrier
	public boolean getCarrier() {
		return carrier;
	}  
	
	// Returns netPrice VRT at 21%
	public double getNetPriceVRT() {
		return netPrice * 0.13;
	}
	
	// return String representation of Motorbike object
	@Override 
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
				super.toString(),
				"Carrier: ", getCarrier(),
				"Net Price VRT @ 13% ", getNetPriceVRT());
	} 
} 
