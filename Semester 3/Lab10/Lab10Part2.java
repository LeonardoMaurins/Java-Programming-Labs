import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;

public class Lab10Part2 extends JFrame{

	public static void main(String[] args){
		new Lab10Part2();
	}

	Lab10Part2(){
		super("My Initials");
		setSize(600,600);
		setVisible(true);
	}


	public void paint(Graphics g){
		super.paint(g);
		
		g.setColor(Color.black);

		g.drawRect(50, 50, 100, 100);
		g.drawRect(200, 50, 100, 100);
		g.drawRect(350, 50, 100, 100);
		g.drawRect(50, 200, 100, 100);
		g.drawRect(50, 350, 100, 100);
		g.drawRect(200, 350, 100, 100);
		g.drawRect(350, 350, 100, 100);
		g.drawRect(350, 200, 100, 100);
	 }
	
}