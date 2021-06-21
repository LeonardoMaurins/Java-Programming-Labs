
public class Computer extends HandHeldDevice {

	protected double computerSpeed;
	protected double computerScreenSize;
	protected int computerMemory;
	
	public Computer(String manufacturer, double weight, double computerSpeed, double computerScreenSize, int computerMemory) {
		super(manufacturer, weight);
		
		this.computerSpeed = computerSpeed;
		this.computerScreenSize = computerScreenSize;
		this.computerMemory = computerMemory;
	}
	
	public double getComputerSpeed() {
		return computerSpeed;
	}
	
	public double getComputerScreenSize() {
		return computerScreenSize;
	}
	
	public int getComputerMemory() {
		return computerMemory;
	}

	@Override
	public String toString() {
		return "Computer [computerSpeed=" + computerSpeed + ", computerScreenSize=" + computerScreenSize
				+ ", computerMemory=" + computerMemory + ", Subclass of " + super.toString() + "]";
	}
	
}
