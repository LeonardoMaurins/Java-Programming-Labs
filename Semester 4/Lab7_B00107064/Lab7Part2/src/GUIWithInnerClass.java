import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIWithInnerClass extends JFrame{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new GUIWithInnerClass();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	JLabel label;
	JButton button;
	JPanel panel, buttonPanel;
	
	public GUIWithInnerClass() {
		Container contentPane = getContentPane();
		
		this.panel = new JPanel();
		this.buttonPanel = new JPanel();
		
		this.button = new JButton("Button");
		this.buttonPanel.add(button);
		this.button.addActionListener(new ButtonResponder());
		
		this.label = new JLabel("Label value");
		this.panel.add(label);
		
		contentPane.add(panel,BorderLayout.CENTER);
		contentPane.add(buttonPanel,BorderLayout.SOUTH);
		
		setTitle("Lab7Part2");
		setSize(500,200);
		setVisible(true);
	}
	
	public class ButtonResponder implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("Outer class label set by inner class " + ButtonResponder.class.getName());		
		}
	}
}
