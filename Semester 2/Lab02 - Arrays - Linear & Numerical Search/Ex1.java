/* Store 10 names from the user into an array; then print all those names that have 5 characters or more*/
import java.util.Scanner;
import java.util.Arrays;
public class Ex1{
	public static void main(String[]args){

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter 10 names");
		String arrayNames[] = new String [10]; //Store 10 names into the array

		for (int i=0; i<arrayNames.length; i++)
		{arrayNames[i] = scan.next();}

		//print those with 5 letters or more
		for (int i =0; i<arrayNames.length;i++){
			if(arrayNames[i].length() >=5){
					System.out.println("Names that have 5 charcaters or more: " + arrayNames[i]);}//end if
		}//end for
	}//end method
}//end class

