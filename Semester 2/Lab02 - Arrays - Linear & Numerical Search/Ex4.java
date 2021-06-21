/*4.	Write a program that initializes an array with ten random integers between 1 and 50 inclusive
and then prints the following: Every element at an even index. Only the odd elements.*/
import java.util.Scanner;
import java.util.Random;
public class Ex4{
	public static void main(String[]args){
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		//print random numbers
		int numbers[] = new int [10];
		for(int i=0; i< numbers.length; i++){
			numbers[i] = (int)(Math.random()*50);}//end for
		for (int j=0; j<numbers.length; j++){
			System.out.println("Random Number: " + numbers[j]);}//end for

		//print every element at an even index
		for(int i = 0; i < numbers.length; i++){
			if(i%2==0){
				System.out.println("Even index numbers: " + numbers[i]);}
		}

		//odd elements
		for(int i = 0; i<numbers.length;i++){
					if(numbers[i]% 2 !=0){
				System.out.println("Odd elements: " + numbers[i]);}
		}

	}
}
