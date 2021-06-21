// This is the Client class which will build the user interfaces
// using the factory classes
public class GUIBuilder {

	// Doesnt concern itself with the type of window as that
	// will be handled by the abstract factory class
	public void buildWindow(AbstractWidgetFactory widgetFactory, String title) {
		Window window = widgetFactory.createWindow(title);
		window.repaint();
	}
}
