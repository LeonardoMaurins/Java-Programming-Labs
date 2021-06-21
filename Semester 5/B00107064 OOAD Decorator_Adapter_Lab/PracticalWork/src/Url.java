// URL is the class that contains the text string which
public class Url extends Content {
	private String txt;

	// Constructor that declares passed string locally
	Url(String txt) {
		this.txt = txt;
	}

	// Prints out the string
	public void show() {
		System.out.println(txt);
	}
}
