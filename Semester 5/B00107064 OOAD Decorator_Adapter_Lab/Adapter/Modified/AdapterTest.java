import java.io.*;

public class AdapterTest{
	
	// Main method which creates a test program
	// to print out ints and  calls methods from the
	// other classes to output results
	public static void main(String[] args)	{
		ScreenAdapter scr = new ScreenAdapter();
        scr.writeInt(10);
		scr.nextLine();
		scr.writeInt(20);
		scr.nextLine();
		scr.writeInt(30);
		scr.nextLine();
		scr.writeInt(40);
		scr.nextLine();
		scr.writeInt(50);
		scr.nextLine();
	}
}
