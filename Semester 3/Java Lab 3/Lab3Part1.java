import javax.swing.*;
import java.awt.*;

class Lab3Part1 extends JFrame{

	public static void main(String[] args){
		JFrame frame = new Lab3Part1();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

	public Lab3Part1(){

		Container contentPane = getContentPane();
		JPanel panel = new JPanel(new GridLayout(0,1,0,5));

		JLabel nameLabel = new JLabel("Name");	//Creating name Label
			panel.add(nameLabel);	//Adding the name Label to the panel
		JTextField tf1 = new JTextField();	//Creating text field 1
			tf1.setText("Enter name");	//Setting the text for tf 1
			panel.add(tf1);	//Adding tf1 to the panel

		JLabel passwordLabel = new JLabel("Password");
			panel.add(passwordLabel);
		JTextField tf2 = new JTextField();
			tf2.setText("Enter password");
			panel.add(tf2);

		JLabel emailLabel = new JLabel("Email");
			panel.add(emailLabel);
		JTextField tf3 = new JTextField();
			tf3.setText("Enter email");
			panel.add(tf3);

		JButton registerButton = new JButton("Register");
			panel.add(registerButton);
		
		contentPane.add(panel);

		setTitle("Registration");
		setSize(600, 250);
		setVisible(true);

   }

}

