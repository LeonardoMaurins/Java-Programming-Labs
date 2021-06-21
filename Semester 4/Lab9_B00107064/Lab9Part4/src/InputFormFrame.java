import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class InputFormFrame extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new InputFormFrame();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	Container contentPane;
	RegisterPanel _registerPanel;
	
	public InputFormFrame() {

		contentPane = getContentPane();
		
		_registerPanel = new RegisterPanel();;
		
		contentPane.add(_registerPanel);
		
		setTitle("Lab9Part4");
		setSize(400,200);
		setVisible(true);
	}
	
	class RegisterPanel extends JPanel{
		
		JTextArea textArea;
		JButton button;
		
        public RegisterPanel()
        {
    		textArea = new JTextArea("Value");
    		button = new JButton("Submit");
    		button.addActionListener(new SubmitResponder());
    		super.add(textArea,BorderLayout.NORTH);
    		super.add(button,BorderLayout.SOUTH);
        }

	}
	
	class SubmitResponder implements ActionListener{
		
		@Override
        public void actionPerformed(ActionEvent e)
        {
			_registerPanel.textArea.setText("Submit completed");
			_registerPanel.textArea.setEditable(false);
			setTitle("Submit Completed!!!");
        }
	}
	
}
