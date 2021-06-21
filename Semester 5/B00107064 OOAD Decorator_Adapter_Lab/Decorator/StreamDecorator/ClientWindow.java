import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;

// ClientWindow creates the interface extending jFrame
public class ClientWindow extends JFrame {
	private JTextArea ltext, rtext;
   	private final int MAX=1000;

   	// The class constructor, sets name of interface and GUI
   	// Creates objects and sets passed text to Strings
	public ClientWindow()  {
   		super("Decorated Input Stream");
      	setGUI();
      	// Create a file object
      	File fl = new File("note.txt");

      	// Read the file contents in a normal way
      	String sNormal   = readNormal(fl);
      	ltext.setText (sNormal);

      	// Read the file with decoration
      	String sDecorated = readDecorated(fl);
      	rtext.setText (sDecorated);

      	// Instantiates size of interface and sets it to be visible
      	setSize(new Dimension(300, 200));
      	setVisible(true);
   }

   // String method for reading files for string
   private String readNormal(File fl) {
	   String sText = "";
	   try {
		   FileInputStream fread = new FileInputStream(fl);
		   byte b[] = new byte[1000];
		   int length = fread.read(b);
		   fread.close();
		   sText = new String(b, 0, length);
	   }
	   catch(FileNotFoundException e){}
	   catch(IOException ie){}
	   return sText;
   }

   // String method for reading decorated files passed to it
   private String readDecorated(File fl) {
	   String sText = "";
	   try {
		   // Pass a new FileInputStream to the StreamDecorator
		   StreamDecorator f = new StreamDecorator(new FileInputStream(fl));
		   sText = f.readLine();
		   f.close();
	   }
	   catch(FileNotFoundException e){}
	   catch(IOException ie){}
	   return sText;
   }

   // setGui function creates the layout and design of the interface for the string text
   private void setGUI() {
	   JPanel jp = new JPanel();
	   getContentPane().add(jp);
	   jp.setLayout (new GridLayout(1,2));
	   ltext = new JTextArea(30,3);
	   rtext = new JTextArea(30,3);
	   ltext.setBorder(new BevelBorder(BevelBorder.LOWERED));
	   rtext.setBorder(new BevelBorder(BevelBorder.LOWERED));

	   // Set the text in the JTextArea's
	   jp.add(ltext);
	   jp.add(rtext);

	   ltext.setLineWrap (true);
	   ltext.setWrapStyleWord (true);
	   rtext.setLineWrap (true);
	   rtext.setWrapStyleWord (true);
   }

	static public void main(String[] argv) {
		new ClientWindow();
	}
}
