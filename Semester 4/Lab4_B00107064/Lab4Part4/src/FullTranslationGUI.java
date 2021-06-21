import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.*;

public class FullTranslationGUI extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new FullTranslationGUI();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	Locale currentLocale;

	public FullTranslationGUI() {
		
		currentLocale = new Locale("en","EN");
		ResourceBundle res = ResourceBundle.getBundle("resource.ListResourceBundle",currentLocale);
		
		Locale[] availableLocales = Calendar.getAvailableLocales(); 
		
		Container contentPane = getContentPane();
		
		JComboBox<String> comboBox = new JComboBox<String>(new String[] {res.getString("ButtonFrench"), res.getString("ButtonEnglish") });
		contentPane.add(comboBox,BorderLayout.NORTH);
				
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea,BorderLayout.CENTER);
		
		JScrollPane scroll = new JScrollPane(textArea);
		contentPane.add(scroll);
		
		JButton button = new JButton("List All Locales");
		contentPane.add(button,BorderLayout.SOUTH);
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if((int) comboBox.getSelectedIndex() == 0) { 					
					currentLocale = new Locale("fr","FR");
				}		
				else if((int) comboBox.getSelectedIndex() == 1) {				
					currentLocale = new Locale("en","EN");
				}
				
				int selectedLanguage = comboBox.getSelectedIndex();
				
				ResourceBundle res = ResourceBundle.getBundle("resource.ListResourceBundle",currentLocale);
							
				button.setText(res.getString("ButtonString"));
				
				comboBox.removeAllItems();
				comboBox.addItem(res.getString("ButtonFrench"));
				comboBox.addItem(res.getString("ButtonEnglish"));
				
				if(selectedLanguage == 0)
					comboBox.setSelectedItem(res.getString("ButtonFrench"));
				else
					comboBox.setSelectedItem(res.getString("ButtonEnglish"));
				
				textArea.setText("");
				for(int i=1;i<availableLocales.length;i++) {
					textArea.append(availableLocales[i].getDisplayName(currentLocale)+"\n");
				}
				textArea.setCaretPosition(0); 
				
			} // End ActionPerformed
		}); //End ActionListener
		
		setTitle("Lab4Part4");
		setSize(300,500);
		setVisible(true);
	} // End Constructor
} // End Class