import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyIntegers{
	public static void main (String[]args){

		int integers [] = (14, 16, 25, 19, 7, 10, 28);

		File namesFile = new File ("C:\\Users\\Toshiba\\Documents\\ITB\\Semester 2\\Programming\\Lab07 - Text Files\\myintegers.txt");

		try (FileWriter writer = new FileWriter(myintegersFile);{
			BufferedWriter bufferW = new BufferedWriter(writer)){
				for (int i=0; i < myintegers.length; i++){
					bufferW.write(myintegers[i] + " ");
				}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}