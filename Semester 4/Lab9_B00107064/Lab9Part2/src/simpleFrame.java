import java.awt.*;
import java.awt.event.*;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.*;

public class simpleFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new simpleFrame();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	JButton button1, button2, button3;
	JLabel label;
	
	Locale englishLocale, frenchLocale, germanLocale;
	ResourceBundle englishRes, frenchRes, germanRes;
	
	public simpleFrame() {
		englishLocale = new Locale("en", "EN");
		frenchLocale = new Locale("fr","FR");
		germanLocale = new Locale("de","DE");
		
		englishRes = ResourceBundle.getBundle("resource.ListResourceBundle",englishLocale);
		frenchRes = ResourceBundle.getBundle("resource.ListResourceBundle",frenchLocale);
		germanRes = ResourceBundle.getBundle("resource.ListResourceBundle",germanLocale);
		
		Container contentPane = getContentPane();
		
		JPanel panel = new JPanel();
		
		label = new JLabel("Hello",SwingConstants.CENTER);
		label.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 30));
		
		button1 = new JButton("English");
		panel.add(button1,BorderLayout.WEST);
		button1.addActionListener(this);
		
		button2 = new JButton("French");
		panel.add(button2,BorderLayout.CENTER);
		button2.addActionListener(this);
		
		button3 = new JButton("German");
		panel.add(button3,BorderLayout.EAST);
		button3.addActionListener(this);
		
		contentPane.add(label, BorderLayout.CENTER);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		setTitle("Lab9Part2");
		setSize(300,400);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {

			label.setText(englishRes.getString("Hello"));

			getContentPane().add(label);
		}
		else if(e.getSource() == button2) {
			label.setText(frenchRes.getString("Hello"));

			getContentPane().add(label);
		}
		else if(e.getSource() == button3) {
			label.setText(germanRes.getString("Hello"));

			getContentPane().add(label);
		}
		
	}

}
