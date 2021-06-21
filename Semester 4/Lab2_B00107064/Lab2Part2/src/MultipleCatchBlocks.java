import java.util.Arrays;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		try {
			/*			
			int array[] = {1,2,3,4};
			System.out.println(Arrays.toString(array));
			System.out.println(array[5]);
			*/
			
			/*
			String str = null;
			str.toString();
			*/
			
			/*
			throw new IllegalArgumentException();
			*/
			
			System.out.println(2/0);
		}
	
		catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException: You are trying to access an index in the array that doesn't exist");
		e.printStackTrace();
		}
		
		catch (NullPointerException e) {
		System.out.println("NullPointerException: You are trying to convert a null value to a string");
		e.printStackTrace();
		}
		
		catch (Exception e) {
		System.out.println("Exception: Generic error, please check code again!");
		e.printStackTrace();
		}
	
		finally {
			System.out.println("Finally has been called. Leonardo Maurins");
		} 
	}

}
