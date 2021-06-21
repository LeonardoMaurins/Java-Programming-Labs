import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CoolDecorator extends Decorator {
	boolean mouse_over; // true when mouse over button
	JComponent thisComp;

	// Constructor that takes in JComponent variable
	public CoolDecorator(JComponent c) {

		// Sets interface title to c
		// mouse_over variable to false
		super(c);
		mouse_over = false;
		thisComp = this; // Save this component
		// Catch mouse movements in inner class
		c.addMouseListener(new MouseAdapter() {
			// Set flag when mouse over
			public void mouseEntered(MouseEvent e) {
				mouse_over = true;
				thisComp.repaint();
			}

			// Clear flag when mouse not over
			public void mouseExited(MouseEvent e) {
				mouse_over = false;
				thisComp.repaint();
				System.out.println(thisComp);
			}
		});
	}

	// Paint the button
	public void paint(Graphics g) {
		super.paint(g); // First draw the parent button
		System.out.println("check");
		// Draw a red border if mouse is over with sizes defined
		if (mouse_over) {
			System.out.println("check");
			Dimension d = super.getSize();
			g.setColor(Color.red);
			g.drawRect(0, 0, d.width - 1, d.height - 1);
			g.drawLine(d.width - 2, 0, d.width - 2, d.height - 1);
			g.drawLine(0, d.height - 2, d.width - 2, d.height - 2);
		}
	}
}
