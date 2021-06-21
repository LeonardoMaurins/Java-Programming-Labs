//Write a program that prints the elements of each row in a 2D String array in reverse order.
import java.util.Scanner;
public class Ex5{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);

		int firstList[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //declare and initialise first array
		int secondList[]; //declare second, leave empty
		secondList = new int[firstList.length];

		System.out.println("Original order of the array: ");
		for(int i=0; i<firstList.length; i++){    //print array from 1-10
			System.out.println(firstList[i]);}//end for

		for(int j=0,k=9; j<firstList.length; j++,k--){ //index for j starts at 0 and index for k ends at 9 (10 numbers total)
			secondList[j] = firstList[k];}//end for

		System.out.println("Reverse order of the array: ");
		for(int l=0; l<secondList.length;l++){
			System.out.println(secondList[l]);}//end for

    }//end public
}//end main