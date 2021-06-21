// Assigns superclass and subclass references to similar variables.
public class PolymorphismTest {
	
	public static void main(String[] args) {
	// Assigns superclass reference with the passed variable
	CommissionEmployee commissionEmployee = new CommissionEmployee(
			"Sue", "Jones", "222-22-2222", 10000, .06);                 

	// Assigns subclass reference with the passed variable
	BasePlusCommissionEmployee basePlusCommissionEmployee =
		new BasePlusCommissionEmployee(                     
			"Bob", "Lewis", "333-33-3333", 5000, .04, 300);     

	// Invokes toString on the superclass object using the superclass variable
	System.out.printf("%s %s:%n%n%s%n%n", 
			"Call CommissionEmployee's toString with superclass reference",
			"to superclass object", commissionEmployee.toString());

	// Invokes toString on the subclass object using the subclass variable
	System.out.printf("%s %s:%n%n%s%n%n", 
			"Call BasePlusCommissionEmployee's toString with subclass",
			"reference to subclass object", 
	basePlusCommissionEmployee.toString());

	// Invokes toString on the subclass object using the superclass variable
	CommissionEmployee commissionEmployee2 =
			basePlusCommissionEmployee;
	System.out.printf("%s %s:%n%n%s%n", 
			"Call BasePlusCommissionEmployee's toString with superclass",
			"reference to subclass object", commissionEmployee2.toString());
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
