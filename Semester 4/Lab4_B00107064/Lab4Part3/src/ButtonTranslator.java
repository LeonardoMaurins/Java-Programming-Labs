import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.*;

public class ButtonTranslator extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new ButtonTranslator();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	public ButtonTranslator() {
		Locale englishLocale = new Locale("en", "EN");
		ResourceBundle res = ResourceBundle.getBundle("resource.ListResourceBundle",englishLocale);
		
		Container contentPane = getContentPane();
		
		JPanel panel = new JPanel();
		
		JButton button1 = new JButton(res.getString("1"));
		panel.add(button1);
		JButton button2 = new JButton(res.getString("2"));
		panel.add(button2);
		JButton button3 = new JButton(res.getString("3"));
		panel.add(button3);
		JButton button4 = new JButton(res.getString("4"));
		panel.add(button4);
		button4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				Locale frenchLocale = new Locale("fr", "FR");
				ResourceBundle res = ResourceBundle.getBundle("resource.ListResourceBundle",frenchLocale);
				JPanel panel = new JPanel();
				
				button1.setText(res.getString("One"));
				button2.setText(res.getString("Two"));
				button3.setText(res.getString("Three"));
				button4.setText(res.getString("Translate to French"));
				
				panel.add(button1);
				panel.add(button2);
				panel.add(button3);
				panel.add(button4);
				getContentPane().add(panel);
			}
			
		});
		
		contentPane.add(panel);
		
		setTitle("Lab4Part3");
		setSize(300,200);
		setVisible(true);
	}
}
