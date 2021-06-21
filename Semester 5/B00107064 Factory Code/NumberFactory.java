// NumberFactory class creates the NumberList Objects
public class NumberFactory {

	public NumberList getNumberList(String list) {

		// Creates index checkers for certain values assigned to variables
		int i = list.indexOf('.');
		int j = list.indexOf('x');

		// Checks if the list has '.' in it
		if (i != -1) {
			return new DoubleList(list);
		}
		// Checks if the list has 'x' in it
		else if (j != -1) {
			return new HexList(list);
		}
		// Else returns the int list
		else {
			return new IntList(list);
		}
	}
}