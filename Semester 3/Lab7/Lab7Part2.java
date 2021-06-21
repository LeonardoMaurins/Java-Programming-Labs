import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class Lab7Part2 extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new Lab7Part2();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
    public Lab7Part2() {

        JDesktopPane desktopPane = new JDesktopPane();

    	for(int i = 0;i<10;i++) {
    		JInternalFrame frame = createFrame();
    		frame.setLocation(25*i,25*i);
    		desktopPane.add(frame);
    	}

        setContentPane(desktopPane);
        setSize(640,480);
        setVisible(true);
        setTitle("Lab7Part2");
    }
	
    protected JInternalFrame createFrame() {

    	JInternalFrame innerFrame = new JInternalFrame("Internal Window" ,
					true, //resizable
					true, //closable
					true, //maximizable
					true); //iconifiable
    	innerFrame.setVisible(true); 
        innerFrame.setSize(200,200);
        
        return innerFrame;
    }
}
