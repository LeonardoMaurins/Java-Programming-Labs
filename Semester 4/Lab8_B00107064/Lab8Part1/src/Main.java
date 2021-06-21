import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		Vector<Car> listOfCars = new Vector<Car>();
		
		listOfCars.add(new AutomaticCar());
		listOfCars.add(new ManualCar());
		listOfCars.add(new AccessibleCar());
		
		
		for (Car car : listOfCars) {
			System.out.println(car.getGearChangeInstructions());
			System.out.println("Number of Gears: " + car.getNumberOfGears() + "\n");
		}
	}

}
