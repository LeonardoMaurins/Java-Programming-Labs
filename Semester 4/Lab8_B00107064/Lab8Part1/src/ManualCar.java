
public class ManualCar implements Car {

	public String getGearChangeInstructions() {

		String desc = "Gear change for " + this.getClass().getName();
		String step1 = "Push clutch";
		String step2 = "Select new gear";
		String step3 = "Release clutch";

		return desc + "\n" + step1 + "\n" + step2 + "\n" + step3;
	}

	@Override
	public int getNumberOfGears() {
		
		return numberOfGears - 5;
	}

}
