import java.awt.*;
import java.awt.event.*;
import java.io.FileReader;
import java.io.IOException;
import java.net.*;

import javax.swing.*;

public class TestFourExceptionsGUI extends JFrame {

	/**
	 * 
	 * @param string Passes a string value to testException method
	 * @param filename Passes a String fileName of a directory, searching for Real.txt in most cases
	 * @param url Passes a website url to testException to see if its correct format and throws an exception if not
	 * @param generalExceptionActivated Passes a boolean to testException method be it true or false to trigger the general exception
	 */
	
	public static void main(String[] args) {
		JFrame frame = new TestFourExceptionsGUI();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	public TestFourExceptionsGUI() {
		Container contentPane = getContentPane();
		
		JPanel panel = new JPanel(new BorderLayout());
		JPanel buttonPanel = new JPanel();
		
		JButton button1 = new JButton("Test IO Exception");
		buttonPanel.add(button1);
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				testException("Hi","Whatever.txt","http://www.itb.ie",false);
			}
		});
		JButton button2 = new JButton("Test URL Exception");
		buttonPanel.add(button2);
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				testException("Hi","C:\\Users\\Crazy\\OneDrive\\Desktop\\Lab2_B00107064\\Lab2Part4\\src\\Real.txt","ht://www.itb.ie",false);
			}
		});
		JButton button3 = new JButton("Test Null Pointer Exception");
		buttonPanel.add(button3);
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				testException(null,"C:\\Users\\Crazy\\OneDrive\\Desktop\\Lab2_B00107064\\Lab2Part4\\src\\Real.txt","http://www.itb.ie",false);
			}
		});
		JButton button4 = new JButton("Test General Exception");
		buttonPanel.add(button4);
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				testException("Hi","C:\\Users\\Crazy\\OneDrive\\Desktop\\Lab2_B00107064\\Lab2Part4\\src\\Real.txt","http://www.itb.ie",true);
			}
		});
		
		panel.add(buttonPanel);
		contentPane.add(panel);
		
        setTitle("Lab2Part4");
		setSize(300,200);
		setVisible(true);
	}

	public void testException(String string, String filename, String url, boolean generalExceptionActivated) {
		
		String str = string;
		
		try {
			str.toCharArray(); //Null string potential error
			new FileReader(filename); //Unknown filename potential error
			new URL(url); //Badly written URL potential error
				if(generalExceptionActivated) { //Potential error
					this.clone(); //Will be caught as a general error!
				}
		}
		catch(MalformedURLException e) {
			JOptionPane.showMessageDialog(null,"A URL has been badly written. " + e.getMessage());
		}
		catch(IOException e) {
			JOptionPane.showMessageDialog(null,"An IO Exception has been caught. " + e.getMessage());
		}
		catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null,"A Null Pointer Exception has been caught. " + e.getMessage());
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Some general unidentified Exception has been caught. " + e.getMessage());
		}
		finally {
			JOptionPane.showMessageDialog(null,"The finally block has been called");
		}
		
	}
}
