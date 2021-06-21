package mathematics;

public class MathHelper {

	/**
	 * 
	 * @param num: The integer that's received from Application class
	 * @return Returns the factorial of the input'd number after being calculated to Application
	 */
	
	public static int factorial(int num) {
		
		int i, fact = 1;
		
		for(i=1;i<=num;i++){    
			fact=fact*i;    
		}    
		
		return fact;
	}
}
