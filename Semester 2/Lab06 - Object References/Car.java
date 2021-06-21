public class Car{

	private String regNumber;//creates an empty string named regNumber
	private double engineSize;//creates an empty double named engineSize
	private String make;//creates an empty string named make


	public Car(double aEngineSize,String aRegNumber,String aMake){
		if(aEngineSize> 0.1 && aEngineSize <7.0){
			engineSize = aEngineSize;
		}
			regNumber = aRegNumber;
			make = aMake;
	}

	public void setEngineSize(double newEngineSize){
		if(newEngineSize > 0.1 && newEngineSize < 7.0){
			engineSize = newEngineSize;
		}
	}

	public void setRegNumber(String newRegNumber, String newMake){
		regNumber = newRegNumber;
		make = newMake;
	}

	public double getEngineSize(){
		if(engineSize >0.1 && engineSize < 7.0){
			return engineSize;
		}
		else{
			double a = 0.1;
			return a;
		}
	}

	public String getRegNumber(){
		if(regNumber == ""){
			regNumber = ("Some registration plate: ");
			return regNumber;
		}
		else{
			return regNumber;
		}
	}

	public String getMake(){
		if(make == ""){
			make =("Some make of a car");
			return make;
		}
		else{
			return make;
		}
	}

	public static void main(String[] args){
		Car Car1 = new Car(2.6,"","");
		System.out.println(Car1.getEngineSize());
		System.out.println(Car1.getRegNumber());
		System.out.println(Car1.getMake());

		System.out.println("");

		Car Car2 = new Car(3.4,"124 D 2014", "Mercedes");
		System.out.println(Car2.getEngineSize());
		System.out.println(Car2.getRegNumber());
		System.out.println(Car2.getMake());
	}
}