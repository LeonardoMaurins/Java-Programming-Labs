
public class LaptopComputer extends Computer {

	protected int batteryLife;
	
	public LaptopComputer(String manufacturer, double weight, double computerSpeed, double computerScreenSize, int computerMemory, int batteryLife) {
		super(manufacturer, weight, computerSpeed, computerScreenSize, computerMemory);
		
		this.batteryLife = batteryLife;
	}
	
	public int getBatteryLife() {
		return batteryLife;
	}

	@Override
	public String toString() {
		return "LaptopComputer [batteryLife=" + batteryLife + ", Subclass of " + super.toString() + "]";
	}
	
}
