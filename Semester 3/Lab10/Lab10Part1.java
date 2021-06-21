import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;

public class Lab10Part1 extends JFrame{

	public static void main(String[] args){
		new Lab10Part1();
	}

	Lab10Part1(){
		super("My Initials");
		setSize(600, 400);
		setVisible(true);
	}


	public void paint(Graphics g){
		super.paint(g);
		
		g.setColor(Color.black);

		g.drawLine(100,100,100,300); // L
		g.drawLine(100,300,200,300);
		
		g.drawLine(300,100,300,300); // M
		g.drawLine(300,100,400,200);
		g.drawLine(400,200,500,100);
		g.drawLine(500,100,500,300);
	 }

}