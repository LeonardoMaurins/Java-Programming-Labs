import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListSelection extends JFrame implements ListSelectionListener {

JList<String> list;


String choices[] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus","Neptune", "Pluto"};

	ListSelection(){

		super("List Selection Example");
		Container c = getContentPane();
		list = new JList<String>(choices);
		list.addListSelectionListener(this);
		JScrollPane pane = new JScrollPane(list);
		c.add(pane);
		setSize(400,300);
		setVisible(true);



	}//end of constructor



public static void main(String[] args){
	  ListSelection myList = new ListSelection();

}


public void valueChanged(ListSelectionEvent e) {
	Object source = e.getSource();
	System.out.println("Hello");
	if (source == list)
	{
		int selectionNum = 0;
		String message = "The selected index is: ";
		selectionNum = list.getSelectedIndex();
		message = message + selectionNum;


		JOptionPane.showMessageDialog(null, message, "List Query", JOptionPane.ERROR_MESSAGE);
		message = "The selected index is: " + list.getSelectedValue();
		JOptionPane.showMessageDialog(null, message, "List Query", JOptionPane.ERROR_MESSAGE);

	}

}











}//end of class
