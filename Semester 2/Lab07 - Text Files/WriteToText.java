import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToText{
	public static void main (String[]args){

		String numbers [] = {"14", "16", "25", "19", "7", "10", "28"};

		File numbersFile = new File ("C:\\Users\\Toshiba\\Documents\\ITB\\Semester 2\\Programming\\Lab07 - Text Files\\myintegers.txt");

		try (FileWriter writer = new FileWriter(numbersFile);
			BufferedWriter bufferW = new BufferedWriter(writer)){
				for (int i=0; i < numbers.length; i++){
					bufferW.write(numbers[i] + " ");
				}
		}catch(IOException e){
			e.printStackTrace();
		}//end catch
	}//end main
}//end class