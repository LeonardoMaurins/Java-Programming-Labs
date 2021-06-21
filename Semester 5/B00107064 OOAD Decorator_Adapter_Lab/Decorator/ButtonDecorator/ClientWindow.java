import java.awt.*;
import java.awt.event.*;
import javax.swing.text.*;
import javax.swing.*;
import javax.swing.event.*;

// Creates a JFrame class which implements action listener for user input
public class ClientWindow extends JFrame implements ActionListener {
	private JButton CButton, DButton, Quit;

	// Class constructor with the JPanel variables and button declarations
	public ClientWindow() {
		super("Client Window");
		JPanel jp = new JPanel();
		getContentPane().add(jp);

		// Adds two new buttons, one normal, one with decorator to the JPanel
		jp.add(new JButton("Normal Button"));
		jp.add(new CoolDecorator(DButton = new JButton("Cool Button")));

		// Adds the quit button with an action listener that exists the system
		jp.add(Quit = new JButton("Quit"));
		Quit.addActionListener(this);
		setSize(new Dimension(200, 200));

		// Sets the JPanel to visible
		setVisible(true);
		Quit.requestFocus();
	}

	// ActionPerformed function for the quit button
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

	// The main method which creates the interface
	static public void main(String argv[]) {
		new ClientWindow();
	}
}
