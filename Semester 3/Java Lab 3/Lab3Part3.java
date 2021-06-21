import javax.swing.*;
import java.awt.*;

class Lab3Part3 extends JFrame{

	public static void main(String[] args){
		JFrame frame = new Lab3Part3();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

	public Lab3Part3(){
		Container contentPane = getContentPane();
		JPanel panel = new JPanel(new BorderLayout());

		String sportsCompanies[] = {"Nike","Addidas","Umbra","Underarmour"};
		String food[] = {"Burger","Fries","Ice Cream","Pizza"};

		JComboBox combo1 = new JComboBox(sportsCompanies);
		JComboBox combo2 = new JComboBox(food);
		
		panel.add(combo1, BorderLayout.NORTH);
		panel.add(combo2, BorderLayout.SOUTH);
		combo2.setEditable(true);
		
		contentPane.add(panel);

		setTitle("JComboBox");
		setSize(600, 250);
		setVisible(true);
   }

}

