public class NumberFactoryTest {

	public static void main(String[] args) {

		// Creates three new string lists with integer, doublelists and hexadecimal
		// values
		String list1 = new String("1 2 3 4 5 6 7 8 9 10");
		String list2 = new String("1.1 2.2 3.3 4.4 5.5 6.6 7.7 8.8 9.9 10.1");
		String list3 = new String("0xFF3 0xAF45 0xE5F 0xE51 0xG3F9 0xF74B 0xG225 0x84EE 0xF82A 0x7B4C");

		// Creates a new object called nFactory
		NumberFactory nfactory = new NumberFactory();

		// getNumberList is a method from NumberFactory class and checks for decimal
		// values
		// getNumberList creates and displays an IntList Object
		nfactory.getNumberList(list1).display();

		// Prints a blank line
		System.out.println("");

		// Prints out the string with object being referenced to the method sum
		System.out.println("Sum of list 1:" + nfactory.getNumberList(list1).sum());

		// Prints a blank line
		System.out.println("");

		// Declares numberlist2 as the obtained DoubleList object which was created by
		// getNumberList
		// Using the reference variable numberlist2 below allows it to store the
		// reference returned by getNumberList (a list of doubles)
		NumberList numberlist2 = nfactory.getNumberList(list2);

		// The object is referenced to our display method
		numberlist2.display();

		// Prints a blank line
		System.out.println("");

		// Prints out the string with object being referenced to the method sum
		System.out.println("Sum of list 2:" + numberlist2.sum());

		// Declares numberlist2 as the obtained DoubleList object which was created by
		// getNumberList
		// Using the reference variable numberlist2 below allows it to store the
		// reference returned by getNumberList (a list of doubles)
		NumberList numberlist3 = nfactory.getNumberList(list3);

		// Prints a blank line
		System.out.println("");

		// The object is referenced to our display method
		numberlist3.display();
	}
}
