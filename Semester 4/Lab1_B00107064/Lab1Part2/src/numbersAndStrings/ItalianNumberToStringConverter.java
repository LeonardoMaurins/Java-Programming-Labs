package numbersAndStrings;

public class ItalianNumberToStringConverter {

	/**
	 * 
	 * @param num: The number that's received from ItalianStringConversionTester to be converted to an Italian word in the convertNumberToString Method
	 * @return The Italian number word that's returned to ItalianStringConversionTester as the converted value
	 */
	
	public static String convertNumberToString(int num) {
		
		String word = "";
		
		if(num==1) {
			word = "Uno";
		}
		else if(num==2) {
			word = "Due";
		}
		else if(num==3) {
			word = "Tre";
		}
		else if(num==4) {
			word = "Quattro";
		}
		else if(num==5) {
			word = "Cinque";
		}
		
		return word;
	}
	
	
}
