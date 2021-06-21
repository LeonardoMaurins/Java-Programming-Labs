import javax.swing.*;
import java.awt.*;

class Lab2Part4 extends JFrame{

	public static void main(String args []){
		Lab2Part4 myFrame = new Lab2Part4();
		myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	public Lab2Part4(){

		Container contentPane = getContentPane();
		JPanel panel = new JPanel();
		contentPane.add(panel);

 		Icon catIcon = new ImageIcon("cat.png");
 		Icon carIcon = new ImageIcon("car.png");
 		Icon friendIcon = new ImageIcon("friend.png");

		JLabel myCatLabel = new JLabel("My cat Terry.");
		    panel.add(myCatLabel);
			myCatLabel.setIcon(catIcon);
			myCatLabel.setHorizontalAlignment(JLabel.RIGHT);

		JLabel myFriendLabel = new JLabel("My friend Mike.");
			panel.add(myFriendLabel);
			myFriendLabel.setIcon(friendIcon);
			myFriendLabel.setHorizontalAlignment(JLabel.RIGHT);

		JLabel myCarLabel = new JLabel("My first Car.");
			panel.add(myCarLabel);
			myCarLabel.setIcon(carIcon);
    		myCarLabel.setHorizontalAlignment(JLabel.RIGHT);

		setTitle("Pictures");
		setSize(600, 250);
		setVisible(true);
   }

}

