
public class AccessibleCar implements Car {

	public String getGearChangeInstructions() {

		String desc = "Gear change for " + this.getClass().getName();
		String step1 = "Use under steering-wheel lever to select gear";
		String step2 = "Set lever to selected gear";
		String step3 = "Car will automatically cycle between gears";

		return desc + "\n" + step1 + "\n" + step2 + "\n" + step3;
	}

	@Override
	public int getNumberOfGears() {

		return numberOfGears;
	}

}
