
public class AutomaticCar implements Car {

	public String getGearChangeInstructions() {

		String desc = "Gear change for " + this.getClass().getName();
		String step1 = "Set lever to selected gear";
		String step2 = "Car will automatically cycle between gears";

		return desc + "\n" + step1 + "\n" + step2;
	}

	@Override
	public int getNumberOfGears() {

		return numberOfGears + 5;
	}

}
