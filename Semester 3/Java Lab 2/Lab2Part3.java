import javax.swing.*;
import java.awt.*;

class Lab2Part3 extends JFrame{

	public static void main(String args []){
		Lab2Part3 myFrame = new Lab2Part3();
		myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	public Lab2Part3(){

		Container contentPane = getContentPane();
		JPanel panel = new JPanel();
		contentPane.add(panel);

		JLabel submitLabel = new JLabel("Submit Here");
		    panel.add(submitLabel);

		JButton submitButton = new JButton("Submit");
    		panel.add(submitButton);

		setTitle("My Label Frame");
		setSize(600, 250);
		setVisible(true);
   }

}

