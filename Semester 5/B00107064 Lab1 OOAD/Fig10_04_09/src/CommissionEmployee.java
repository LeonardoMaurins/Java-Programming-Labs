// This class extends the class Employee.
public class CommissionEmployee extends Employee {
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage

	// Five-argument constructor
	public CommissionEmployee(
			String firstName, String lastName, String socialSecurityNumber, 
			double grossSales, double commissionRate) {
		
		// Calling the object constructor for the variables below
		super(firstName, lastName, socialSecurityNumber);

		// Throws exception if comissionRate is invalid
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { 
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}
		
		// Throws exception if grossSales is invalid
		if (grossSales < 0.0) { 
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		// Global variables in this class inherit the values passed to this
		// Constructor once it is called from PayrollSystemTest
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} 

	// Declares the Gross Sales amount
	public void setGrossSales(double grossSales) {
		// Throws exception if grossSales is invalid
		if (grossSales < 0.0) { 
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		this.grossSales = grossSales;
	} 

	// return gross sales amount
	public double getGrossSales() {
		return grossSales;
	}

	// set commission rate
	public void setCommissionRate(double commissionRate) {
		// Throws exception if comissionRate is invalid
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { 
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}
		this.commissionRate = commissionRate;
	} 

	// return commission rate
	public double getCommissionRate() {
		return commissionRate;
	}

	// calculate earnings; override abstract method earnings in Employee
	@Override                                                           
	public double earnings() {                                          
		return getCommissionRate() * getGrossSales();                    
	}                                                                   

	// return String representation of CommissionEmployee object
	@Override                                                   
	public String toString() {                                  
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",     
				"commission employee", super.toString(),              
				"gross sales", getGrossSales(),                       
				"commission rate", getCommissionRate());              
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
