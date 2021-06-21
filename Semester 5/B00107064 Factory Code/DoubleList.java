import java.util.StringTokenizer;

public class DoubleList extends NumberList {

	int size;

	public DoubleList(String list) {

		size = 0;

		StringTokenizer token = new StringTokenizer(list);
		size = token.countTokens();

		// Allocate some space for the array
		doubleList = new double[size];

		// Store each list item an the appropriate array
		for (int i = 0; i < size; i++) {
			doubleList[i] = Double.parseDouble(token.nextToken());
		}
	}

	// Sums the values in the list up and returns the total
	public Number sum() {

		double n = 0;

		for (int i = 0; i < size; i++) {
			n = n + doubleList[i];
		}

		return new Double(n);
	}

	// Display method outputs the list with the index number beside the values
	public void display() {

		System.out.print("Double List");

		for (int i = 0; i < size; i++) {
			System.out.println("[" + i + "] = " + doubleList[i]);
		}
	}
}