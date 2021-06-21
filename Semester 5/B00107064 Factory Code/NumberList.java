public abstract class NumberList {

	protected int[] intList;
	protected double[] doubleList;
	protected String[] hexList;

	public NumberList() {
		intList = null;
		doubleList = null;
		hexList = null;
	}

	public int[] getIntList() {
		return intList;
	}

	public double[] getDoubleList() {
		return doubleList;
	}

	public String[] getHexList() {
		return hexList;
	}

	public void display() {

	}

	public Number sum() {
		return null;
	}

}