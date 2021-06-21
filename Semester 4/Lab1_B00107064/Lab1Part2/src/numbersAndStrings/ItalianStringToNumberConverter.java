package numbersAndStrings;

public class ItalianStringToNumberConverter {
	
	/**
	 * 
	 * @param str: The String that's received from ItalianStringConversionTester to be converted to an Italian number in the convertStringToNumber Method
	 * @return The number that's returned to ItalianStringConversionTester as the converted value from it's Italian word
	 */
		
	public static int convertStringToNumber(String str) {
		
		int number = 0;
		
		if(str.equalsIgnoreCase("Uno")) {
			number = 1;
		}
		else if(str=="Due") {
			number = 2;
		}
		else if(str=="Tre") {
			number = 3;
		}
		else if(str=="Quattro") {
			number = 4;
		}
		else if(str=="Cinque") {
			number = 5;
		}
		
		return number;
	}
}
