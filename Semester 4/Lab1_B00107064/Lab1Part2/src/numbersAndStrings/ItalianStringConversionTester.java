package numbersAndStrings;

public class ItalianStringConversionTester {

	/**
	 * 
	 * @param args Two System print lines which input values to the methods of those classes and return converted data and then displaying it it
	 */
	
	public static void main(String[] args) {
		
		System.out.println("The Italian Number: " + ItalianNumberToStringConverter.convertNumberToString(3));
		System.out.println("The Italian Number: " + ItalianStringToNumberConverter.convertStringToNumber("Due"));
	}

}
