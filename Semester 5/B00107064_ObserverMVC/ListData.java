import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

// ListData Class contains functionality for the data vector, getters and setters essentially CRUD
public class ListData extends AbstractListModel {
	private Vector data;

	// Declares data as a new Vector object
	public ListData() {
		data = new Vector();
	}

	// Returns of the data vector size
	public int getSize() {
		return data.size();
	}

	// Obtains the element at the current index within the data vector
	public Object getElementAt(int index) {
		return data.elementAt(index);
	}

	// Adds a String element to the data vector
	public void addElement(String s) {
		data.addElement(s);
		fireIntervalAdded(this, data.size() - 1, data.size());
	}

	// Removes a String element from the data vector
	public void removeElement(String s) {
		int index = data.indexOf(s);
		if (index > -1) {
			data.remove(index);
			fireIntervalRemoved(this, index, data.size());
		}
	}
}
