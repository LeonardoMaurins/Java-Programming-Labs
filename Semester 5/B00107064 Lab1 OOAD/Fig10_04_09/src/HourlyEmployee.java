// HourlyEmployee extends the Employee class
public class HourlyEmployee extends Employee {
	
	// Initializes private global variables  
	private double wage; // wage per hour
	private double hours; // hours worked for week

	// Five-argument Constructor
	public HourlyEmployee(
			String firstName, String lastName, String socialSecurityNumber, 
			double wage, double hours) {
		
		// Calling the object constructor for the variables below
		super(firstName, lastName, socialSecurityNumber);

		// Throws exception if wage is invalid
		if (wage < 0.0) { 
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}

		// Throws exception if hours is invalid
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}
		// Global variables in this class inherit the values passed to this
		// Constructor once it is called from PayrollSystemTest
		this.wage = wage;
		this.hours = hours;
	} 

	// Declares the wage amount
	public void setWage(double wage) {
		// Throws exception if wage is invalid
		if (wage < 0.0) { 
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}
		this.wage = wage;
	} 

	// return wage
	public double getWage() {return wage;}

	// set hours worked
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
	}
		this.hours = hours;
	} 

	// return hours worked
	public double getHours() {return hours;}

	// Calculates earnings.
	// Override abstract method "Earnings" in Employee
	@Override                                                           
	public double earnings() {                                          
		if (getHours() <= 40) { // no overtime                           
			return getWage() * getHours();                                
		}                                                                
		else {                                                           
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;  
		}                                                                
	}                                                                   

	// return String representation of HourlyEmployee object              
	@Override                                                             
	public String toString() {                                            
		return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f", 
				super.toString(), "hourly wage", getWage(),                     
				"hours worked", getHours());                                    
	}                                                                     
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
