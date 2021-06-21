import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab9Part3 extends JFrame{

	public static void main(String[]args){
		JFrame frame = new Lab9Part3();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	public Lab9Part3(){
		Container contentPane = getContentPane();
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Choices");
		menuBar.add(menu);
		
		JMenuItem subjectChoices = new JMenuItem("Subject Choices");
		menu.add(subjectChoices);
		
		subjectChoices.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String [] subjectsChoices = {"Interactive Multimedia", "Information Technology Maths", "Database Fundamentals"};
				
				String subject = (String)JOptionPane.showInputDialog(contentPane, "Pick a subject destination: \n",
				"Destination: ",JOptionPane.QUESTION_MESSAGE,null,subjectsChoices,subjectsChoices[0]);

				if(subject == "Interactive Multimedia"){
					JOptionPane.showMessageDialog(contentPane, "You have chosen: " + subject, "Your favourite subject selection", JOptionPane.INFORMATION_MESSAGE, null); 
				}
				else if (subject == "Information Technology Maths"){
					JOptionPane.showMessageDialog(contentPane, "You have chosen: " + subject, "Your favourite subject selection", JOptionPane.INFORMATION_MESSAGE, null); 
				}
				else if (subject == "Database Fundamentals"){
					JOptionPane.showMessageDialog(contentPane, "You have chosen: " + subject, "Your favourite subject selection", JOptionPane.INFORMATION_MESSAGE, null); 
				}
			}
		});
		
		
		setJMenuBar(menuBar);
		setTitle("Lab9Part3");
		setSize(500,300);
		setVisible(true);
	}

}