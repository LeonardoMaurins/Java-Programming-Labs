public class HttpsDecorator extends Decorator {
	// Constructor that passes contentToBeDecorated to the parent class
	HttpsDecorator(Content contentToBeDecorated) {
		super(contentToBeDecorated);
	}

	public void show() {
		// Decorates the string and outputs afterwards
		System.out.print("https://www.");
		// Delegate
		super.show();
	}
}
