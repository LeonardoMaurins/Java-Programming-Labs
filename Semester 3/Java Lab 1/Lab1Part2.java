import java.util.Arrays;

public class Lab1Part2 {

	public static void main(String[] args){

		char[] Surname = new char[]{'M', 'a', 'u', 'r', 'i', 'n', 's'};

		int SurnameLength = Surname.length;

		for(int i=0;i<SurnameLength;i++){
			System.out.println(Surname[i] + " = " + (int)Surname[i] );
		}
	}
}