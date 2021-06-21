// This is a concrete factory class which extends the abstract factory class
public class MsWindowsWidgetFactory extends AbstractWidgetFactory {
	// Creates an MSWindow
	public Window createWindow(String title) {
		MSWindow window = new MSWindow(title);
		return window;
	}
}
