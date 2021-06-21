package gui;

import java.awt.event.*;

import javax.swing.*;
import java.awt.*;

import numberAndStrings.ItalianNumberToStringConversion;

/**
 * @ItalianStringNumberConversionFrame Method creates a Frame for the interface that contains 2 labels, 2 textfields and a button
 * @Button The button has an action listener implemented that gets the int value from the first textfield and sends it to the other class
 * @Result The returned value from the other class is the String that gets set as the second textfield text whenever the button is pressed
 */

public class ItalianStringNumberConversionFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		JFrame frame = new ItalianStringNumberConversionFrame();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	public ItalianStringNumberConversionFrame() {
		
		Container contentPane = getContentPane();
        
        JPanel panel = new JPanel(new BorderLayout());
        
        JPanel topPanel = new JPanel();
        
        JLabel midLabel = new JLabel("Enter an Integer to convert to Italian String: ");
        topPanel.add(midLabel);
        JTextField topTf = new JTextField();
        topTf.setPreferredSize(new Dimension(50,24));
        topPanel.add(topTf);
        
        JPanel midPanel = new JPanel();
        
        JLabel topLabel = new JLabel("The text version of the number entered in Italian is: ");
        midPanel.add(topLabel);
        JTextField midTf = new JTextField();
        midTf.setPreferredSize(new Dimension(50,24));
        midTf.setEditable(false);
        midPanel.add(midTf);
        
        JPanel botPanel = new JPanel();
        
        JButton button = new JButton("Convert");
        button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int topTfValue = Integer.parseInt(topTf.getText());
				String result = ItalianNumberToStringConversion.convertNumberToString(topTfValue);
				midTf.setText(result);
			}
        	
        });
        botPanel.add(button);
        
        panel.add(topPanel,BorderLayout.NORTH);
        panel.add(midPanel,BorderLayout.CENTER);
        panel.add(botPanel,BorderLayout.SOUTH);
        
        contentPane.add(panel);

        setTitle("ItalianStringNumberConversionFrame");
		setSize(400,150);
		setVisible(true);
	}
}
