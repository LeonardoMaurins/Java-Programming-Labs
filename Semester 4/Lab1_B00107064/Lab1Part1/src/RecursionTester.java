
public class RecursionTester {

	public static void main(String[] args) {
		
		System.out.println("Number: " + recursiveAddition(5));
	}
	
	/**
	 * Method created for recursion of inputed number within main method, uses int number value which gets returned
	 * @param number: The value that's input to get the factorial of
	 * @return 
	 */
	public static int recursiveAddition(int number) { 
		
		
		if(number==1) { //Recursion ends if this is true
			return 1;
		}
		
		else { // Pushed onwards to stack and method then calls itself again to continue the process
			return number + (recursiveAddition(number -1));
		}
	}
}
