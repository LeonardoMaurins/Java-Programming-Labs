import java.util.StringTokenizer;

public class HexList extends NumberList {

	int size;

	public HexList(String list) {

		size = 0;
		StringTokenizer token = new StringTokenizer(list);
		size = token.countTokens();

		// Allocates space for the array
		hexList = new String[size];

		// Store each list item an the appropriate array
		for (int i = 0; i < size; i++) {
			hexList[i] = (token.nextToken());
		}
	}

	// Display method outputs the list with the index number beside the values
	public void display() {

		System.out.print("Hexadecimal List");

		for (int i = 0; i < size; i++) {
			System.out.println("[" + i + "] = " + hexList[i]);
		}
	}

}// end class