import java.awt.*;
import javax.swing.*;

// Decorator class that changes the layout of the component to Flow
public class Decorator extends JComponent {
	public Decorator(JComponent c) {
		setLayout(new FlowLayout());
		// Add("Center", c);
		add(c);
	}
}
