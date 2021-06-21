import java.awt.*;
import java.awt.event.*;
import java.util.*;

//swing classes
import javax.swing.text.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import javax.swing.tree.*;

// The client class extends JFrame for interface
// and implements TreeSelectionListener for a tree structure
public class Client extends JFrame implements TreeSelectionListener {
	// Initializes local variables
	Employee prez, marketVP, prodVP;
	Employee salesMgr, advMgr;
	Employee prodMgr, shipMgr;

	JScrollPane sp;
	JPanel treePanel;
	JTree tree;
	DefaultMutableTreeNode troot;
	JLabel cost;

	// Client Constructor which creates the employees and GUI
	public Client() {
		super("Employee Composite");
		makeEmployees();
		createGUI();
	}

	// GUI Interface for the tree
	private void createGUI() {
		treePanel = new JPanel();
		getContentPane().add(treePanel);
		treePanel.setLayout(new BorderLayout());
		sp = new JScrollPane();
		treePanel.add("Center", sp);
		treePanel.add("South", cost = new JLabel("          "));
		treePanel.setBorder(new BevelBorder(BevelBorder.RAISED));
		troot = new DefaultMutableTreeNode(prez.getName());
		tree = new JTree(troot);
		tree.setBackground(Color.lightGray);
		loadTree(prez);
		// Puts the tree into a scroller
		sp.getViewport().add(tree);
		setSize(new Dimension(200, 300));
		setVisible(true);
	}

	// Method for loading/repaiting the tree when called
	public void loadTree(Employee topDog) {
		DefaultMutableTreeNode troot;
		troot = new DefaultMutableTreeNode(topDog.getName());
		treePanel.remove(tree);
		tree = new JTree(troot);
		tree.addTreeSelectionListener(this);
		sp.getViewport().add(tree);
		addNodes(troot, topDog);
		tree.expandRow(0);
		repaint();
	}

	// addNodes is called recursively until
	// all the leaves in each node are processed
	private void addNodes(DefaultMutableTreeNode pnode, Employee emp) {
		DefaultMutableTreeNode node;
		Enumeration e = emp.subordinates();
		if (e != null) {
			while (e.hasMoreElements()) {
				Employee newEmp = (Employee) e.nextElement();
				node = new DefaultMutableTreeNode(newEmp.getName());
				pnode.add(node);
				addNodes(node, newEmp);
			}
		}
	}

	// Creates the employees subordinates and their subordinates
	private void makeEmployees() {
		// Boss subordinate with their subordinates
		prez = new Boss("CEO", 200000);
		prez.add(marketVP = new Boss("Marketing VP", 100000));
		prez.add(prodVP = new Boss("Production VP", 100000));

		// marketVP subordinate with their subordinates
		marketVP.add(salesMgr = new Boss("Sales Mgr", 50000));
		marketVP.add(advMgr = new Boss("Advt Mgr", 50000));
		// Salespeople that report to sales manager are added
		for (int i = 0; i < 5; i++)
			salesMgr.add(new Employee("Sales " + i, rand_sal(30000)));
		advMgr.add(new Employee("Secy", 20000));

		// prodVP subordinate with their subordinates
		prodVP.add(prodMgr = new Boss("Prod Mgr", 40000));
		prodVP.add(shipMgr = new Boss("Ship Mgr", 35000));
		// Adds manufacturing staff
		for (int i = 0; i < 4; i++)
			prodMgr.add(new Employee("Manuf " + i, rand_sal(25000)));
		// Adds shipping staff
		for (int i = 0; i < 3; i++)
			shipMgr.add(new Employee("ShipClrk " + i, rand_sal(20000)));
	}

	// Obtains a random salary
	private long rand_sal(long salary) {
		return salary + (long) (Math.random() - 0.5) * salary / 5;
	}

	// Gets the changed value of the path for the tree and changes it
	public void valueChanged(TreeSelectionEvent evt) {
		TreePath path = evt.getPath();
		String selectedTerm = path.getLastPathComponent().toString();
		Employee emp = prez.getChild(selectedTerm);
		if (emp != null)
			cost.setText(new Float(emp.getSalaries()).toString());
	}

	// Class the client constructor to instantiate the class
	static public void main(String argv[]) {
		new Client();
	}
}
