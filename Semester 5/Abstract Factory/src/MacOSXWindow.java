// Concrete product B that extends Window class
public class MacOSXWindow extends Window {

	// One argument constructor
	MacOSXWindow(String text) {
		// Declares title to the passed text
		this.title = text;
	}

	public void repaint() {
		// Mac OSX specific behaviour
		System.out.println("Title: " + title);
		System.out.println("Window style: Mac OSX.");
	}
}
