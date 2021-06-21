import java.io.File;

public class FileMethods{
//Create the file
	public static void main (String[]args){
	File file = new File("C:\\Users\\Toshiba\\Documents\\ITB\\Semester 2\\Programming\\Lab07\\integers.txt");

	System.out.println(file.exists()); //Check to see if the file exists
	System.out.println(file.isDirectory()); //False
	System.out.println(file.isFile()); //True if it is a file
	System.out.println(file.getAbsolutePath());
	file.setWritable(true);
	System.out.println(file.canWrite());



	}
}


