// Concrete product A that extends Window class
public class MSWindow extends Window {

	// One argument constructor
	MSWindow(String text) {
		// Declares title to the passed text
		this.title = text;
	}

	public void repaint() {
		// MS Windows specific behaviour
		System.out.println("Title: " + title);
		System.out.println("Window style: MS Windows.");
	}
}
