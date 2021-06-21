import java.lang.reflect.*;
import com.sun.java.swing.*;

public class InvokeMethod {
	public InvokeMethod() {
		// Creates a Person instance
		Person p = new Person("Alex", "Dublin");
		
		System.out.println("Before method invocation.");
		// Calls the display method to print the variables
		p.display();

		// Create an array method for the Person class created
		Method[] methods = p.getClass().getMethods();
		for (int i = 0; i < methods.length; i++) {
			// Checks to see if the method is setName
			if (methods[i].getName() == "setName") {
				try {
					// Invokes the setName method on the Person instance
					Object o = methods[i].invoke(p, "John");
				} catch (InvocationTargetException | IllegalAccessException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		System.out.println("After method invocation.");
		// Calls the display method to print the variables
		p.display();
	}

	// Calls the constructor to execute the code
	static public void main(String argv[]) {
		new InvokeMethod();
	}
}