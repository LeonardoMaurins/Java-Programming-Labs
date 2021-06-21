import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile{
	public static void main (String[]args){
		File file = new File ("C:\\Users\\Toshiba\\Documents\\ITB\\Semester 2\\Programming\\Lab07 - Text Files\\integers.txt");
		try (FileReader reader = new FileReader (file);
			BufferedReader bufferR = new BufferedReader(reader)){
				String line = "";
				while ((line = bufferR.readLine()) != null){
					System.out.println(line);
				}
			}catch(IOException e){
				System.out.println("Error..");
			}
		}
	}