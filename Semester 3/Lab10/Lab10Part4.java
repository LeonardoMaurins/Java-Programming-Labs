import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;

public class Lab10Part4 extends JFrame{

	public static void main(String[] args){
		new Lab10Part4();
	}

	Lab10Part4(){
		super("Chimney with Santa's Foot");
		setSize(500,700);
		setVisible(true);
	}


	public void paint(Graphics g){
		super.paint(g);

		g.setColor(new Color(30,30,30));
		g.fillRect(0,0,500,700);//Set background color

		g.setColor(Color.black);

		g.drawRect(200,170,50,80);//Foot base
		g.drawArc(160,140,80,60,0,-180);//Foot Arc
		g.drawLine(160,170,200,170);//Foot bottom

		//Smoke clouds
		g.drawOval(275,200,50,30);
		g.drawOval(300,125,80,50);
		g.drawOval(340,40,110,70);

		//Snow
		g.drawOval(50,50,10,10);
		g.drawOval(400,300,10,10);
		g.drawOval(75,250,10,10);
		g.drawOval(225,150,10,10);
		g.drawOval(150,100,10,10);
		g.drawOval(450,200,10,10);
		g.drawOval(100,150,10,10);
		g.drawOval(250,75,10,10);

		//Colouring
		//Chimney Brown
		g.setColor(new Color(200,125,70));
		g.fillRect(150, 300, 150, 300);
		g.fillRect(100, 250, 250, 50);

		//Smoke clouds Grey
		g.setColor(new Color(200,200,200));
		g.fillOval(275,200,50,30);
		g.fillOval(300,125,80,50);
		g.fillOval(340,40,110,70);

		//Santa Foot

		g.setColor(new Color(100,65,45));
		g.fillArc(160,140,80,60,0,-180);
		g.setColor(Color.red);
		g.fillRect(200,170,50,80);

		//Snow
		g.setColor(Color.white);
		g.fillOval(50,50,10,10);
		g.fillOval(400,300,10,10);
		g.fillOval(75,250,10,10);
		g.fillOval(225,150,10,10);
		g.fillOval(150,100,10,10);
		g.fillOval(450,200,10,10);
		g.fillOval(100,150,10,10);
		g.fillOval(250,75,10,10);

		//Drawing chimney lines
		g.setColor(Color.black);
		//Across
		g.drawLine(150,350,300,350);
		g.drawLine(150,400,300,400);
		g.drawLine(150,450,300,450);
		g.drawLine(150,500,300,500);
		g.drawLine(150,550,300,550);
		g.drawLine(150,600,300,600);

		//Downwards
		g.drawLine(200,300,200,350);
		g.drawLine(200,400,200,450);
		g.drawLine(200,500,200,550);
		g.drawLine(250,300,250,350);
		g.drawLine(250,400,250,450);
		g.drawLine(250,500,250,550);

		g.drawLine(225,350,225,400);
		g.drawLine(225,450,225,500);
		g.drawLine(225,550,225,600);
		g.drawLine(175,350,175,400);
		g.drawLine(175,450,175,500);
		g.drawLine(175,550,175,600);
		g.drawLine(275,350,275,400);
		g.drawLine(275,450,275,500);
		g.drawLine(275,550,275,600);

		g.drawLine(125,250,125,300);
		g.drawLine(175,250,175,300);
		g.drawLine(225,250,225,300);
		g.drawLine(275,250,275,300);
		g.drawLine(325,250,325,300);

		//Final outlines
		g.drawRect(150, 300, 150, 300); //Chimney Stack
		g.drawRect(100, 250, 250, 50); //Chimney Top
	 }

}