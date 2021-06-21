
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MyAction extends JFrame implements ActionListener {

	public MyAction(){

		super("My First Frame");

		Container c = getContentPane();
		JPanel panel = new JPanel();
		JButton button = new JButton("Execute an Action");
		button.addActionListener(this);
		panel.add(button);
		c.add(panel);
		setSize(400,300);
		setVisible(true);

	}//end of constructor


	public static void main(String args[]){

		MyAction testAction = new MyAction();

	}


	public void actionPerformed(ActionEvent e) {

    	System.out.println("Thursday");

	}

} // end of class