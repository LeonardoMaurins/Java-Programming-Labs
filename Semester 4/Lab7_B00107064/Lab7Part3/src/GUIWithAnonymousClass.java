
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIWithAnonymousClass extends JFrame{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		GUIWithAnonymousClass GUI = new GUIWithAnonymousClass();
		
		JPanel labelPanel = new JPanel();
		JPanel buttonPanel = new JPanel();

		JLabel label = new JLabel("Label value");
		labelPanel.add(label);
		
		JButton button = new JButton("Button");
		buttonPanel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Outer class label set by inner anonymous class " + GUIWithAnonymousClass.class.getName());
			}
		}); 

		GUI.getContentPane().add(labelPanel,BorderLayout.CENTER);
		GUI.getContentPane().add(buttonPanel,BorderLayout.SOUTH);	

		GUI.setTitle("Lab7Part3");
		GUI.setSize(500,200);
		GUI.setVisible(true);
	}
}
