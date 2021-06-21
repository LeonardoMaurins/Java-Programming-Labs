import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class Lab7Part1 extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new Lab7Part1();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

    public Lab7Part1() {

        JDesktopPane desktopPane = new JDesktopPane(); //a specialized layered pane
        JInternalFrame innerFrame = new JInternalFrame("Internal Window" ,
              										true, //resizable
              										false, //closable
              										true, //maximizable
              										false);//iconifiable

        JPanel innerPanel = new JPanel();
        JButton innerButton = new JButton("Button in Internal Frame");
        innerPanel.add(innerButton);
        JLabel innerLabel = new JLabel("Label in Internal Frame");
        innerPanel.add(innerLabel);
        
        innerFrame.setSize(300,300);
		innerFrame.setVisible(true);
		
		innerFrame.add(innerPanel);
		desktopPane.add(innerFrame);

        setContentPane(desktopPane); //important as it allows us to add items to the desktop
        setSize(640,480);
        setVisible(true);
        setTitle("Lab7Part1");
    }
	
}
