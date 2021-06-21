import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab9Part2 extends JFrame{

	public static void main(String[]args){
		JFrame frame = new Lab9Part2();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	public Lab9Part2(){
		Container contentPane = getContentPane();
		
		JButton dialogButton = new JButton("Show country options");
		
		dialogButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String [] holidayList = {"Germany", "France", "Ireland", "Latvia", "Netherlands"};
				
				String holiday = (String)JOptionPane.showInputDialog(contentPane, "Pick a holiday destination: \n",
				"Destination: ",JOptionPane.QUESTION_MESSAGE,null,holidayList,holidayList[0]);

				if(holiday == "Germany"){
					 JLabel Germany = new JLabel(new ImageIcon("images/germany.jpg"));
					 JOptionPane.showMessageDialog(contentPane, Germany, "Germany",  JOptionPane.PLAIN_MESSAGE, null);
				}
				else if (holiday == "France"){
					JLabel France = new JLabel(new ImageIcon("images/france.jpg"));
					JOptionPane.showMessageDialog(contentPane, France, "France", JOptionPane.PLAIN_MESSAGE, null);
				}
				else if (holiday == "Ireland"){
					JLabel Ireland = new JLabel(new ImageIcon("images/ireland.jpg"));
					JOptionPane.showMessageDialog(contentPane, Ireland, "Ireland", JOptionPane.PLAIN_MESSAGE, null);
				}
				else if (holiday == "Latvia"){
					JLabel Latvia = new JLabel(new ImageIcon("images/latvia.jpg"));
					JOptionPane.showMessageDialog(contentPane, Latvia, "Latvia", JOptionPane.PLAIN_MESSAGE, null);
				}
				else if (holiday == "Netherlands"){
					JLabel Netherlands = new JLabel(new ImageIcon("images/netherlands.jpg"));
					JOptionPane.showMessageDialog(contentPane, Netherlands, "Netherlands", JOptionPane.PLAIN_MESSAGE, null);
				}
				
			}
		});
		
		contentPane.add(dialogButton); 
		
		setTitle("Lab9Part2");
		setSize(300,200);
		setVisible(true);
	}

}