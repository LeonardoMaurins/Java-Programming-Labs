import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab9Part1 extends JFrame{

	public static void main(String[]args){
		JFrame frame = new Lab9Part1();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	public Lab9Part1(){
		Container contentPane = getContentPane();
		
		JButton dialogButton = new JButton("Show dialog");
		
		dialogButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String inputDialog = JOptionPane.showInputDialog("Type in your hometown below");
				setTitle(inputDialog); 
				
			}
		});
		
		contentPane.add(dialogButton); 
		
		setTitle("Lab9Part1");
		setSize(300,200);
		setVisible(true);
	}

}