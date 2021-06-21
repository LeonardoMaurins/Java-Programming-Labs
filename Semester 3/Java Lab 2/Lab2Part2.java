import javax.swing.*;
import java.awt.*;

class Lab2Part2 extends JFrame{

	public static void main(String args []){
		Lab2Part2 myFrame = new Lab2Part2();
		myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	public Lab2Part2(){

		Container contentPane = getContentPane();
		JPanel panel = new JPanel();
		contentPane.add(panel);

		setTitle("My Label Frame");
		setSize(600, 250);
		setVisible(true);

		JLabel myNameLabel = new JLabel("Leonardo Maurins");
		    panel.add(myNameLabel);
		JLabel myAgeLabel = new JLabel("20 Years Old");
		    panel.add(myAgeLabel);

		// Font fancyFont = new Font("Serif", Font.BOLD | Font.ITALIC, 32);
		// myNameLabel.setFont(fancyFont);

   }

}

