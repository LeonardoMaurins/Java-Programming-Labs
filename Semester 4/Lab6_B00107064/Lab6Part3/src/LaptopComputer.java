
public class LaptopComputer extends Computer {

	protected int batteryLife;
	
	public LaptopComputer(double computerSpeed, double computerScreenSize, int computerMemory, int batteryLife) {
		super(computerSpeed, computerScreenSize, computerMemory);
		this.batteryLife = batteryLife;
	}
	
	public int getBatteryLife() {
		return batteryLife;
	}
	
}
