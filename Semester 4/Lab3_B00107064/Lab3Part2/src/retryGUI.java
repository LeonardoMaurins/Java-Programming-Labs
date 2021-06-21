import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.JFrame;

/**
 * 
 * This class creates a JFrame with 2 JLabels, Textfield and a button that changes one of the
 * JLabels to A, B or C depending on number input into the Textfield
 * If there is an error, it will open a JOptionPane to allow the user to enter another value
 * as their initial was out of bounds. Throws an exception if they enter wrong again.
 * 
 * @param	inputLabel: The label that tells the user to input a value
 * @param	tf: The textfield where the user inputs a number
 * @param	outputLabel: The label that shows a result based on input prior
 * @param	inputButton: The button that causes to process the value in the textfield
 */

public class retryGUI extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		JFrame frame = new retryGUI();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	String[] stringArray = {"A","B","C"};
	
	public retryGUI() {
		Container contentPane = getContentPane();
		
		JPanel mainPanel = new JPanel();
		JPanel panel = new JPanel(new BorderLayout());
		
		JLabel inputLabel = new JLabel("Please enter the index of the array to output: ");
		panel.add(inputLabel,BorderLayout.NORTH);
		
		JTextField tf = new JTextField(5);
		panel.add(tf,BorderLayout.CENTER);
		
		JLabel outputLabel = new JLabel("This text will change");
		panel.add(outputLabel,BorderLayout.SOUTH);
		
		JButton inputButton = new JButton("Input Button");
		contentPane.add(inputButton,BorderLayout.SOUTH);
		inputButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				
				try {
				int intTf = Integer.parseInt(tf.getText());
				
				outputLabel.setText(stringArray[intTf]);
				}
				catch(ArrayIndexOutOfBoundsException ex){
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException exc){}
					try {
						int optionTf = Integer.parseInt(JOptionPane.showInputDialog(null, "You attempted to access beyond the limits of the array, please try again"));
						outputLabel.setText(stringArray[optionTf]);
					}
					catch(ArrayIndexOutOfBoundsException exception) {
						exception.printStackTrace();
					}
				}
			}
		});
		
		mainPanel.add(panel);
		contentPane.add(mainPanel);
		
		setSize(300,200);
		setTitle("Lab3Part2");
		setVisible(true);
	}

}
