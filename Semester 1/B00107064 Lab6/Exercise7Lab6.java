import java.util.Scanner;
import java.util.ArrayList;

public class Exercise7Lab6{
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		System.out.println("Use -1 to exit the loop!");
		System.out.println("Please insert two numbers:");
		int a = scr.nextInt();
		int b = scr.nextInt();
		int input = 0;
		ArrayList<Integer> oddlist = new ArrayList<Integer>();
		ArrayList<Integer> evenlist = new ArrayList<Integer>();
		while(input != -1){
			input = scr.nextInt();
			if(input % 2 == 0){
				evenlist.add(input);
				continue;
			}else if(input == -1){
				continue;
			}else{
				oddlist.add(input);
				continue;
			}
			
		}
		System.out.println("Number of odds = " + (oddlist.size() + 1));
		System.out.println("Number of evens = " + (evenlist.size() + 1));
	}
}