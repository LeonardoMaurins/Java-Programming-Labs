import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab8Part1 extends JPanel {

    JLabel fileInfoLabel;
    JFileChooser fc;
    JButton openButton;
	
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            
        	public void run() {
        		GUI();
            }
        });
    }

    public Lab8Part1() {
    	
        super(new BorderLayout());

        fileInfoLabel = new JLabel("");
        JScrollPane fileInfoScrollPane = new JScrollPane(fileInfoLabel);
        
        fc = new JFileChooser();

        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        openButton = new JButton("Open a File");
        openButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == openButton) {
		            int returnVal = fc.showOpenDialog(Lab8Part1.this);

		            if (returnVal == JFileChooser.APPROVE_OPTION) {
		                File file = fc.getSelectedFile();
		                fileInfoLabel.setText("Opened: " + file.getName() + "\n");
		            } 
		            
		            else {
		            	fileInfoLabel.setText("Open command cancelled" + "\n");
		            }
		        }
			}
		});

        JPanel buttonPanel = new JPanel(); 
        buttonPanel.add(openButton);
        
        add(buttonPanel, BorderLayout.PAGE_START);
        add(fileInfoScrollPane, BorderLayout.CENTER);
    }

    public static void GUI() {
    	
        JFrame frame = new JFrame("Lab8Part1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent newContentPane = new Lab8Part1();
        
        frame.setContentPane(newContentPane);
        frame.setSize(640,480);
        frame.setVisible(true);
    }
}
