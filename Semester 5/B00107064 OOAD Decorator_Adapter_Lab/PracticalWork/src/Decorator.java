// Decorator class which extends Content
public class Decorator extends Content {
	// Creates an object reference for contentToBeDecorated
	private Content contentToBeDecorated;

	// Constructor that takes in the content variable and declares it locally
	Decorator(Content contentToBeDecorated) {
		this.contentToBeDecorated = contentToBeDecorated;
	}

	// Show is implemented in the content class which we extend
	public void show() {
		contentToBeDecorated.show();
	}
}
