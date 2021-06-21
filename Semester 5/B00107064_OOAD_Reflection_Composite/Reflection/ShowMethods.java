import java.lang.reflect.*;
import com.sun.java.swing.*;

public class ShowMethods {

	public ShowMethods() {
		// Creates a Person instance
		Person p = new Person("Alex", "Dublin");

		System.out.println("Method list:");
		System.out.println("*******************************");

		// Create an array method for the Person class created
		Method[] methods = p.getClass().getMethods();
		for (int i = 0; i < methods.length; i++) {

			// Prints out the method names
			System.out.println(methods[i].getName());

			// For each method creates a list of parameters and types
			Class cl[] = methods[i].getParameterTypes();
			for (int j = 0; j < cl.length; j++)
				// Print the parameter types
				System.out.println(cl[j].toString());
		}
	}

	// Calls the constructor to execute the code
	static public void main(String argv[]) {
		new ShowMethods();
	}
}
