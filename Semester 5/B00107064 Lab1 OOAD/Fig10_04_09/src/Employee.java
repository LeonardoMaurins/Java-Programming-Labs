// Employee abstract superclass.
public abstract class Employee {
	
	// Initializes private global variables  
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;

	// Three-argument constructor
	public Employee(String firstName, String lastName, 
					String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	} 

	// Returns firstName
	public String getFirstName() {
		return firstName;
	}

	// Returns lastName
	public String getLastName() {
		return lastName;
	}

	// Returns socialSecurityNumber
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	// Returns String representation of Employee object
	@Override
	public String toString() {
		return String.format("%s %s%nsocial security number: %s", 
				getFirstName(), getLastName(), getSocialSecurityNumber());
	}

	// Abstract method must be overridden by concrete subclasses
	public abstract double earnings();
} 



/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
