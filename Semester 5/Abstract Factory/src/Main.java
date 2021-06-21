// Our main executable class that executes and connects all the classes together
public class Main {

	public static void main(String[] args) {

		// Creates new builder object
		GUIBuilder builder = new GUIBuilder();
		AbstractWidgetFactory widgetFactory = null;

		// Checks what platform the user is on.
		if (System.getProperty("os.name").toLowerCase().contains("mac")) {
			widgetFactory = new MacOSXWidgetFactory();
		} else {
			widgetFactory = new MsWindowsWidgetFactory();
		}

		// Builds the new window after retrieving the OS
		builder.buildWindow(widgetFactory, "New Window");
	}
}