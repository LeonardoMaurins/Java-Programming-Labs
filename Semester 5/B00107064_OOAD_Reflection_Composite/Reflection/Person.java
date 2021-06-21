public class Person {
	private String name;
	private String address;

	// Constructor receiving two variables
	// Declaring local variables to obtain names of array methods
	Person(String initName, String initAddress) {
		name = initName;
		address = initAddress;
	}

	// Getters and setters for variables below
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	// When called, prints out the name and address variables
	public void display() {
		System.out.println(name + " " + address);
	}
}
