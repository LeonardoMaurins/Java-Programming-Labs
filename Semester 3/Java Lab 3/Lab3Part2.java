import javax.swing.*;
import java.awt.*;

class Lab3Part2 extends JFrame{

	public static void main(String[] args){
		JFrame frame = new Lab3Part2();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

	public Lab3Part2(){
		Container contentPane = getContentPane();
		
		String cities[] = {"Paris","Rome","Dublin","Riga","New York"};

		JList list = new JList(cities);
		JScrollPane pane = new JScrollPane(list);
		contentPane.add(pane, BorderLayout.NORTH);

		
		setTitle("JList");
		setSize(600, 250);
		setVisible(true);
   }

}

