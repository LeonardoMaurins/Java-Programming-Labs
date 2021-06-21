public class HttpDecorator extends Decorator {
	// Constructor that passes contentToBeDecorated to the parent class
	HttpDecorator(Content contentToBeDecorated) {
		super(contentToBeDecorated);
	}

	public void show() {
		// Decorates the string and outputs afterwards
		System.out.print("http://www.");
		// Delegate
		super.show();
	}
}
