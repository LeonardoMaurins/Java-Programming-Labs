import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class StopTheLights extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		
		JFrame frame = new StopTheLights();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end main

	JButton onButton1, onButton2, offButton;
	
	boolean redLight, amberLight, greenLight;
	
	boolean onButton2Pressed;
	
	ThreadColoring thread;
	
	public StopTheLights() {
		super("Traffic lights");
		
		redLight = false;
		amberLight = false;
		greenLight = false;
		
		Container contentPane = getContentPane();
		
		JPanel buttonPanel = new JPanel(new BorderLayout());
		
		this.onButton1 = new JButton("Turn lights on!");
		buttonPanel.add(onButton1,BorderLayout.NORTH);
		this.onButton1.addActionListener(this);
		
		this.onButton2 = new JButton("Hold to keep lights on!");
		buttonPanel.add(onButton2,BorderLayout.CENTER);
		this.onButton2.addMouseListener(new MouseAdapter(){
			
			public void mousePressed(MouseEvent e) {
				if(e.getSource() == onButton2) {
					startThreadColoring();
				}
			}
			public void mouseReleased(MouseEvent e) {
				if(e.getSource() == onButton2) {
					thread.stopThread();
				}
			}
		});
		
		this.offButton = new JButton("Turn lights off!");
		buttonPanel.add(offButton,BorderLayout.SOUTH);
		this.offButton.addActionListener(this);
		
		contentPane.add(buttonPanel,BorderLayout.SOUTH);
		
		setSize(400,700);
		setVisible(true);
	}//end constructor
	
	public void paint(Graphics g) {
		super.paint(g);
		
		//Light box
		g.fillRect(100, 100, 200, 400);
		g.fillRect(190, 500, 20, 115);
		
		//Red Light
		if(!redLight)
			g.setColor(Color.GRAY);
		else
			g.setColor(Color.RED);
		g.drawOval(150, 125, 100, 100);
		g.fillOval(150, 125, 100, 100);
		
		//Amber Light
		if(!amberLight)
			g.setColor(Color.GRAY);
		else
			g.setColor(new Color(231,194,81));
		g.drawOval(150, 250, 100, 100);
		g.fillOval(150, 250, 100, 100);
		
		//Green Light
		if(!greenLight)
			g.setColor(Color.GRAY);
		else
			g.setColor(Color.GREEN);
		g.drawOval(150, 375, 100, 100);
		g.fillOval(150, 375, 100, 100);
	}//end paint
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == onButton1) {
			this.startThreadColoring();
			repaint();
		}
		else if(e.getSource() == offButton) {
			if(this.thread.isRunning()) {
				this.thread.stopThread();
			}
		}
	}//end actionPerformed
	
	public void startThreadColoring() {
		if(this.thread == null || !this.thread.isRunning()) {
			System.out.println("Thread Start");
			this.greenLight = true;
			
			this.thread = new ThreadColoring(this);
			this.thread.start();
		}
	}//end startThreadColoring
}//end Class
