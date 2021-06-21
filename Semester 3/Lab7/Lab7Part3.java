import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class Lab7Part3 extends JFrame{

	public static void main(String[] args) {
		JFrame frame = new Lab7Part3();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

    public Lab7Part3() {

        JDesktopPane desktopPane = new JDesktopPane();

        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("Apps");
        menuBar.add(menu);

        JMenuItem fontAppItem = new JMenuItem("Font App");
        menu.add(fontAppItem);
        fontAppItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
		    	JInternalFrame innerFrame = new JInternalFrame("Font App" ,
						true, //resizable
						true, //closable
						true, //maximizable
						true); //iconifiable

		    	JPanel panel = new JPanel();

		    	JLabel firstFontLabel = new JLabel("First font");
		    	firstFontLabel.setFont(new Font("Courier",Font.ITALIC, 20));
		    	panel.add(firstFontLabel);


		    	JLabel secondFontLabel = new JLabel("First font");
		    	secondFontLabel.setFont(new Font("Times New Roman",Font.BOLD, 20));
		    	innerFrame.add(secondFontLabel);
		    	panel.add(secondFontLabel);

		    	desktopPane.add(innerFrame);
		    	innerFrame.add(panel);

		    	innerFrame.setVisible(true);
		    	innerFrame.setSize(200,200);
			}
		});
        JMenuItem imageAppItem = new JMenuItem("Image App");
        menu.add(imageAppItem);
        imageAppItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
		    	JInternalFrame innerFrame = new JInternalFrame("Image App" ,
						true, //resizable
						true, //closable
						true, //maximizable
						true); //iconifiable

		    	JPanel panel = new JPanel();

		    	JLabel imageLabel = new JLabel();
		    	imageLabel.setIcon(new ImageIcon("Images/trash.png"));
		    	panel.add(imageLabel);

		    	JLabel firstFontLabel = new JLabel("Here's your java");
		    	firstFontLabel.setFont(new Font("Comic Sans MS",Font.ITALIC, 20));
		    	panel.add(firstFontLabel);

		    	innerFrame.add(panel);
		    	desktopPane.add(innerFrame);
		    	innerFrame.setVisible(true);
		    	innerFrame.setSize(300,300);
			}
		});


        setContentPane(desktopPane);
        setJMenuBar(menuBar);
        setSize(640,480);
        setVisible(true);
        setTitle("Lab7Part3");
    }

}