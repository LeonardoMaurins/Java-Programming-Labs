/**
 * The class CarClassifier creates an enum of four car types
 * that get passed to the getSampleCar method via the main
 * and returns a String value based on the passed carType
 * in order to print the associated car with it.
 * 
 * @param carType: The Enumeration of four car types.
 * @method getSampleCar: Receives a CarType variable
 * and returns a string.
 * @param car: A string variable returning the car to main.
 */

public class CarClassifier {
	
	public static void main(String[] args) {
		System.out.println(getSampleCar(CarType.MUSCLE));
		System.out.println(getSampleCar(CarType.CLASSIC));
		System.out.println(getSampleCar(CarType.MPV));
		System.out.println(getSampleCar(CarType.SPORT));
	}

	enum CarType{
		SPORT,MPV,CLASSIC,MUSCLE;
	}
	
	public static String getSampleCar(CarType carType) {
		
		String car = "";
		
		if(carType == CarType.SPORT) {
			car = "Ferrari is a SPORTS car!";
		}
		else if(carType == CarType.MPV) {
			car = "Volkswagen Sharan is an MPV car!";
		}
		else if(carType == CarType.CLASSIC) {
			car = "AC Cobra is a CLASSIC car!";
		}
		else if(carType == CarType.MUSCLE) {
			car = "Ford Mustang is a MUSCLE car!";
		}
		
		return car;
	}
}
