import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class tryClass {

	public static void main(String[] args) {
		
		String file = "C:\\Users\\CrazyLeo\\Desktop\\Lab3_B00107064\\Lab3Part1\\src\\myName.txt";
		
		File nameFile = new File(file);
		
		try(BufferedReader r = new BufferedReader(new FileReader(nameFile))){
			String textLine = r.readLine();
			System.out.println(textLine);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
