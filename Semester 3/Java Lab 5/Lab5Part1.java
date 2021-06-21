import javax.swing.*;
import java.awt.*;

class Lab5Part1 extends JFrame{

	public static void main(String[] args){
		JFrame frame = new Lab5Part1();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

public Lab5Part1(){

		JMenuBar mb = new JMenuBar();

		JMenu functionsMenu = new JMenu("Functions");
			mb.add(functionsMenu);
		JMenu languagesMenu = new JMenu("Languages");
			mb.add(languagesMenu);
		
		JMenuItem fileItem = new JMenuItem("File");
			functionsMenu.add(fileItem);
		JMenuItem openItem = new JMenuItem("Open");
			functionsMenu.add(openItem);

		JMenuItem russianItem = new JMenuItem("Russian");
			languagesMenu.add(russianItem);
			russianItem.setIcon(new ImageIcon("images/russia.png"));
			russianItem.setIcon(new ImageIcon(((new ImageIcon("images/russia.png")).getImage()).getScaledInstance(40, 30, java.awt.Image.SCALE_SMOOTH)));
			
		JMenuItem englishItem = new JMenuItem("English");
			languagesMenu.add(englishItem);
			englishItem.setIcon(new ImageIcon(((new ImageIcon("images/english.png")).getImage()).getScaledInstance(40, 30, java.awt.Image.SCALE_SMOOTH)));
			

		setJMenuBar(mb);

		setTitle("Languages and Flags");
		setSize(500, 300);
		setVisible(true);
   }

}