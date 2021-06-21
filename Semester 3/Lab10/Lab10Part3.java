import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;

public class Lab10Part3 extends JFrame{

	public static void main(String[] args){
		new Lab10Part3();
	}

	Lab10Part3(){
		super("Duckies");
		setSize(800,400);
		setVisible(true);
	}


	public void paint(Graphics g){
		super.paint(g);
		
		g.setColor(Color.black);

		//First duck
		g.drawOval(100,100,150,100);//Body
		g.drawOval(70, 60, 90,70);//Head
		g.drawOval(35, 85, 50, 20);//Beak
		
		//Second Duck
		g.drawOval(300,100,150,100);
		g.drawOval(270, 60, 90,70);
		g.drawOval(235, 85, 50, 20);
		
		//Third Duck
		g.drawOval(500,100,150,100);
		g.drawOval(470, 60, 90,70);
		g.drawOval(435, 85, 50, 20);
		
		// Sets beak colors, also first so it doesn't go over the bodies
		g.setColor(Color.red); 
		g.fillOval(35, 85, 50, 20);
		g.fillOval(235, 85, 50, 20);
		g.fillOval(435, 85, 50, 20);
		
		//First duck body color
		g.setColor(Color.yellow);
		
		g.fillOval(100,100,150,100);//Colors Body
		g.fillOval(70,60,90,70);//Colors Head
		
		//Second duck body color
		g.setColor(Color.green);

		g.fillOval(300,100,150,100);
		g.fillOval(270,60,90,70);
		
		//Third duck body color
		g.setColor(Color.blue);

		g.fillOval(500,100,150,100);
		g.fillOval(470,60,90,70);
	 }
	
}