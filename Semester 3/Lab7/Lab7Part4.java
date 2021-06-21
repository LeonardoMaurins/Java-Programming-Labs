import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.*;

import java.util.Random;

import java.awt.*;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class Lab7Part4 extends JFrame{

	public static void main(String[] args) {
		JFrame frame = new Lab7Part4();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

    public Lab7Part4() {

        JDesktopPane desktopPane = new JDesktopPane();

        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("Select");
        menuBar.add(menu);

        JMenuItem xoItem = new JMenuItem("X's and O's");
        menu.add(xoItem);
        xoItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
		    	JInternalFrame innerFrame = new JInternalFrame("X's and O's Game" ,
						true, //resizable
						true, //closable
						true, //maximizable
						true); //iconifiable

		    	JPanel xoPanel = createXO();


		    	desktopPane.add(innerFrame);
		    	innerFrame.add(xoPanel);

		    	innerFrame.setVisible(true);
		    	innerFrame.setSize(200,200);
			}
		});
        JMenuItem sudokuItem = new JMenuItem("Sudoku");
        menu.add(sudokuItem);
        sudokuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
		    	JInternalFrame innerFrame = new JInternalFrame("Sudoku Game" ,
						true, //resizable
						true, //closable
						true, //maximizable
						true); //iconifiable

		    	JPanel sudokuPanel = createSudoku();


		    	desktopPane.add(innerFrame);
		    	innerFrame.add(sudokuPanel);

		    	innerFrame.setVisible(true);
		    	innerFrame.setSize(400,400);
			}
		});


        setContentPane(desktopPane);
        setJMenuBar(menuBar);
        setSize(640,480);
        setVisible(true);
        setTitle("Lab7Part4");
    }

    public JPanel createXO() {

    		JPanel panel = new JPanel(new GridLayout(3,3));

    		for(int i = 0;i<9;i++) {

				Random rand = new Random();

				char letter;

				if (rand.nextBoolean()){
				letter = 'X';
				}
				else{
				letter = 'O';
				}

    			JButton boxButton = new JButton("" + letter);
    			panel.add(boxButton);

    		}

    	return panel;
    }

    public JPanel createSudoku() {

		JPanel panel = new JPanel(new GridLayout(9,9));

		for(int i = 0;i<81;i++) {
			
			Random rand = new Random();

				if (rand.nextBoolean()){
	                int num = rand.nextInt(9 - 1) + 1;

	    			JButton boxButton = new JButton("" + num);
	    			panel.add(boxButton);
				}
				
				else{
				JButton boxButton = new JButton("");
				panel.add(boxButton);
				}	
				
		}

	return panel;
}

}