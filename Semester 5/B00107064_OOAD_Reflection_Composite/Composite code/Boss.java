import java.util.*;

// Boss is a subclass of Employee which allows
// us to store subordinate employees
public class Boss extends Employee {
	// Stores employees in the vector
	Vector employees;

	// Constructor with 2 passed variables
	// Retrieves parent values, sets leaf to false
	// and declares new employees to vector
	public Boss(String initName, long initSalary) {
		super(initName, initSalary);
		leaf = false;
		employees = new Vector();
	}

	// Constructor with 3 passed variables
	// Retrieves parent values, sets leaf to false
	// and declares new employees to vector
	public Boss(Employee initParent, String initName, long initSalary) {
		super(initParent, initName, initSalary);
		leaf = false;
		employees = new Vector();
	}

	// Promotes employee positions to boss
	// Which allows it to have employees
	public Boss(Employee emp) {
		super(emp.getName(), emp.getSalary());
		employees = new Vector();
		leaf = false;
	}

	// Method for generating errors since employees can't have subordinates
	public boolean add(Employee e) throws NoSuchElementException {
		employees.add(e);
		return true;
	}

	// Method for generating errors since employees can't have subordinates
	public void remove(Employee e) throws NoSuchElementException {
		employees.removeElement(e);
	}

	// Ensures the interface behaves the same way it does for boss
	public Enumeration subordinates() {
		return employees.elements();
	}

	//Gets a list of salaries from employees under a certain manager
	public float getSalaries() {
		float sum = salary;
		for (int i = 0; i < employees.size(); i++) {
			sum += ((Employee) employees.elementAt(i)).getSalaries();
		}
		return sum;
	}

	// Gets the subordinate children under the employee
	public Employee getChild(String s) throws NoSuchElementException {
		Employee newEmp = null;
		if (getName().equals(s))
			return this;
		else {
			boolean found = false;
			Enumeration e = subordinates();
			while (e.hasMoreElements() && (!found)) {
				newEmp = (Employee) e.nextElement();
				found = newEmp.getName().equals(s);
				if (!found) {
					if (!newEmp.isLeaf()) {
						newEmp = newEmp.getChild(s);
					} else
						newEmp = null;
					found = (newEmp != null);
				}
			}
			if (found)
				return newEmp;
			else
				return null;
		}
	}

}
