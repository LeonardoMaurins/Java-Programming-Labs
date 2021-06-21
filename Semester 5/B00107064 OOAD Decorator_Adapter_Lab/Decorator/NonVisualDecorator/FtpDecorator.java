public class FtpDecorator extends Decorator {
	// Constructor that passes contentToBeDecorated to the parent class
	FtpDecorator(Content contentToBeDecorated) {
		super(contentToBeDecorated);
	}

	public void show() {
		// Decorates the string and outputs afterwards
		System.out.print("ftp.");
		// Delegate
		super.show();
	}
}
