
public class Computer {

	protected double computerSpeed;
	protected double computerScreenSize;
	protected int computerMemory;
	
	public Computer(double computerSpeed, double computerScreenSize, int computerMemory) {
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
}
