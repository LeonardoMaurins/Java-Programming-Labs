import java.util.*;

public abstract class AbstractEmployee {

	// Declaring protected variables to the package
	protected String name;
	protected float salary;
	protected Employee parent = null;
	protected boolean leaf = true;

	// Leaf interface
	public abstract float getSalary();

	// Leaf interface
	public abstract String getName();

	// Node interface
	public abstract boolean add(Employee e) throws NoSuchElementException;

	// Node interface
	public abstract void remove(Employee e) throws NoSuchElementException;

	// Node interface
	public abstract Enumeration subordinates();

	// Node interface
	public abstract Employee getChild(String s);

	// Leaf interface
	public abstract float getSalaries();

	// Node interface
	public Boolean isLeaf() {
		return leaf;
	}
}