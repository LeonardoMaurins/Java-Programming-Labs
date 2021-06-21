// This is another concrete factory class which extends the abstract factory class
public class MacOSXWidgetFactory extends AbstractWidgetFactory {

	// Creates a MacOSXWindow
	public Window createWindow(String title) {
		MacOSXWindow window = new MacOSXWindow(title);
		return window;
	}
}
