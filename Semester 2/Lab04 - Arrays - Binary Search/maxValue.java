/*3  Write a program that uses the Arrays class to implement the following 2 methods (make sure that you test these methods):
-	 A method that returns a sorted array of integers;
-	 A method that takes in an array of chars and a char to search for, then returns a message stating the position of element,
	if the character couldn’t be found, it should return a message saying “Character not found!!”  (Group Work)*/

import java.util.*; //imports any needed packages
public class maxValue{
	public static void main(String[] arg) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter max array size: ");
		int maxArr = in.nextInt();

		int arrayInts [] = new int[maxArr];
		char arrayChars [] = new char[maxArr];
		System.out.print("Enter integer values: ");

		for(int i = 0; i < arrayInts.length; i++) {
			arrayInts[i] = in.nextInt();
		}
		System.out.println();

		System.out.print("Enter the same amount of characters as previous question: ");
		for(int i = 0; i < arrayChars.length; i++) {
			arrayChars[i] = in.next().charAt(0);
		}
		System.out.println();

		System.out.print("Enter the letter you want to check: ");
		char find = in.next().charAt(0);
		System.out.println();
		sortInt(arrayInts);

		for(int i = 0; i < arrayInts.length; i++) {
			System.out.print(arrayInts[i] + "\t");
		}
		System.out.println();

		if(searchChar(arrayChars,find) != -1){
			System.out.println("Character found at position " + searchChar(arrayChars,find));
		}
		else{
			System.out.println("Character not found!!");
		}
	}

	public static int[] sortInt(int[] arrayInts) {
		Arrays.sort(arrayInts);
		return arrayInts;
	}

	public static int searchChar(char[] arrayChars, char find) {
		for(int i = 0; i < arrayChars.length; i++){
			if(arrayChars[i] == find){
				return i;
			}
		}
		return -1;
	}
}