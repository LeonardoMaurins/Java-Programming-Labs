import java.util.*;

// This employee class is a leaf
public class Employee extends AbstractEmployee {
	// Constructor with 2 passed variables
	public Employee(String initName, float initSalary) {
		name = initName;
		salary = initSalary;
		leaf = true;
	}

	// Constructor with 3 passed variables
	public Employee(Employee initParent, String initName, float initSalary) {
		name = initName;
		salary = initSalary;
		parent = initParent;
		leaf = true;
	}

	// Getter for salary
	public float getSalary() {
		return salary;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Method for generating errors since employees can't have subordinates
	public boolean add(Employee e) throws NoSuchElementException {
		throw new NoSuchElementException("No subordinates");
	}

	// Method for generating errors since employees can't have subordinates
	public void remove(Employee e) throws NoSuchElementException {
		throw new NoSuchElementException("No subordinates");
	}

	// Ensures the interface behaves the same way it does for boss
	public Enumeration subordinates() {
		Vector v = new Vector();
		return v.elements();
	}

	// Gets child of employee
	public Employee getChild(String s) throws NoSuchElementException {
		throw new NoSuchElementException("No children");
	}

	// Getter for salary
	public float getSalaries() {
		return salary;
	}

	// Getter for parent of employee
	public Employee getParent() {
		return parent;
	}
}
