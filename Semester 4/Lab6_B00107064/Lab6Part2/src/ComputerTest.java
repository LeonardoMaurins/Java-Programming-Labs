import java.util.ArrayList;

public class ComputerTest {

	public static void main(String[] args) {
		
		ArrayList<Computer> list = new ArrayList<>();
		list.add(new Computer (3.7, 14, 500 ));
		list.add(new Computer (2.0, 11.2, 250));
		list.add(new Computer (4.5, 15.6, 1000));	
		
		for(Computer comp:list) {
			System.out.println("-Computer Information-");
			System.out.println("Processor Speed: " + comp.getComputerSpeed() + "GHz");
			System.out.println("Monitor size: " + comp.getComputerScreenSize() + " Inches");
			System.out.println("Hard Drive Storage: " + comp.getComputerMemory() + "GB");
			System.out.println("");
		}
	}//end main
}//end class
