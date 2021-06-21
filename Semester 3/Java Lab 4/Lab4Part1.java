import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Lab4Part1 extends JFrame implements ActionListener{

	public static void main(String[] args){
		JFrame frame = new Lab4Part1();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

public Lab4Part1(){
	Container contentPane = getContentPane();
		JPanel panel = new JPanel();

		JLabel helloLabel = new JLabel("Hello");
			panel.add(helloLabel);
		JButton translateButton = new JButton("Translate to Russian");
			translateButton.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent e) {
					helloLabel.setText("Privet");
				}
			});
			panel.add(translateButton);
		contentPane.add(panel);

		setTitle("Lab4Part1");
		setSize(800, 600);
		setVisible(true);
   }


}