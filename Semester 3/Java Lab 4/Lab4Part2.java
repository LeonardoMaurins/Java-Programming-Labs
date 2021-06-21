import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Lab4Part2 extends JFrame implements ActionListener{

	public static void main(String[] args){
		JFrame frame = new Lab4Part2();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   String colours[] = {"Red", "Blue", "Green"};

public Lab4Part2(){
	Container contentPane = getContentPane();
		JPanel panel = new JPanel();

		JComboBox colourSelector = new JComboBox(colours);
			panel.add(colourSelector);
		JButton changeColour = new JButton("Change Colour");
			panel.add(changeColour);
			changeColour.addActionListener(new ActionListener(){
			
				public void actionPerformed(ActionEvent e) {
					int selectedIndex = colourSelector.getSelectedIndex();
					if (selectedIndex == 0){
						panel.setBackground(Color.red);
					}
					else if (selectedIndex == 1){
						panel.setBackground(Color.blue);
					}
					else if (selectedIndex == 2){
						panel.setBackground(Color.green);
					}
				}
			});


		contentPane.add(panel);
		
		setTitle("Change Colours");
		setSize(800, 600);
		setVisible(true);
   }


}