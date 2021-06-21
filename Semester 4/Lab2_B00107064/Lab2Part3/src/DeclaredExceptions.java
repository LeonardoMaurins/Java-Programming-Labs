import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DeclaredExceptions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a word to be capitalized: ");
		System.out.println("Capitalized: " + capitalizeString(sc.nextLine()));
		
		System.out.print("Enter a file to be found: ");

			try {
				System.out.println("Existence of file: " + openFile(sc.nextLine())); // Required try block because of an unhandled exception type IOException
			} catch (IOException e) {
				e.printStackTrace();
			} 
		
		sc.close();
	}

	public static String capitalizeString(String s) throws NullPointerException {
			
		String str = s.toUpperCase();
		
		if(str.isEmpty()) { // If statement for if the string is empty, it throws the exception below
			throw new NullPointerException("No value entered!");
		}
		
		return str;
	}
	
	public static boolean openFile(String fileName) throws IOException {
		
		File file = new File(fileName); // Directory of file(s) you're searching for
		
		return file.exists(); // Returns true or false based on existence
	}
}
