
public class HandHeldDevice extends ElectronicDevice{

	protected double weight;
	
	public HandHeldDevice(String manufacturer, double weight) {
		super(manufacturer);
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "HandHeldDevice [weight=" + weight + ", Subclass of " + super.toString() + "]";
	}
	
}

