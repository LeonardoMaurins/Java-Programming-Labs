import java.awt.*;
import java.awt.event.*;
import javax.swing.text.*;
import javax.swing.*;
import javax.swing.event.*;

// Creates a JFrame class which implements action listener for user input
public class Client extends JFrame {
	private JButton addButton, updateButton, deleteButton, findButton;

	// Class constructor with the JPanel variables and button declarations
	public Client() {
		JPanel panel = new JPanel();

		// Adds four buttons to the GUI
		panel.add(new ButtonDecorator(addButton = new JButton("Add")));
		panel.add(new ButtonDecorator(updateButton = new JButton("Update")));
		panel.add(new ButtonDecorator(deleteButton = new JButton("Delete")));
		panel.add(new ButtonDecorator(findButton = new JButton("Find")));

		getContentPane().add(panel);
		
		setTitle("B00107064LeonardoMaurins");
		setSize(400, 200);
		setVisible(true);
	}

	// The main method which creates the interface
	static public void main(String argv[]) {
		new Client();
	}
}
