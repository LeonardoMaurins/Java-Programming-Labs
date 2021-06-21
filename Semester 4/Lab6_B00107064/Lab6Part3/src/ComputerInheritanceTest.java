
import java.util.ArrayList;

public class ComputerInheritanceTest {

	public static void main(String[] args) {
		
		ArrayList<Computer> normalList = new ArrayList<>();
		normalList.add(new Computer (3.7, 14, 500));
		normalList.add(new Computer (2.0, 11.2, 250));
		
		ArrayList<LaptopComputer> specializedList = new ArrayList<>();
		specializedList.add(new LaptopComputer (1.7, 15.6, 2000, 4));
		specializedList.add(new LaptopComputer (4, 21, 1000, 7));
		
		for(Computer comp:normalList) {
			System.out.println("-Computer Information-");
			System.out.println("Processor Speed: " + comp.getComputerSpeed() + "GHz");
			System.out.println("Monitor size: " + comp.getComputerScreenSize() + " Inches");
			System.out.println("Hard Drive Storage: " + comp.getComputerMemory() + "GB");
			System.out.println("");
		}
		
		for(LaptopComputer comp:specializedList) {
			System.out.println("-Laptop Computer Information-");
			System.out.println("Processor Speed: " + comp.getComputerSpeed() + "GHz");
			System.out.println("Monitor size: " + comp.getComputerScreenSize() + " Inches");
			System.out.println("Hard Drive Storage: " + comp.getComputerMemory() + "GB");
			System.out.println("Battery Life: " + comp.getBatteryLife() + "Hours");
			System.out.println("");
		}
		
	}//end main
}//end class
