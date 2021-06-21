/*write enhanced for loops for the following tasks:
Computing the product/multiplication of all elements in the array.
Counting how many elements in the array are negative.*/
import java.util.Scanner;
public class Ex3{
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);

		int listArray[] = {2, 4, 6, 1, 4};
		int arrayNum[] = { 3, 4, -7, -3, -2, 5, 1, -6, -24, 80};
		System.out.println("The product is: " + prodOfNum(listArray));
		System.out.println("The product is: " + negNum(arrayNum));

	}
	public static int prodOfNum(int a[]){
		int product=1;
		for(int num:a){
			product*=num;}//end for
		return product;
	}

	public static int negNum(int n[]){
		int negative = 0;
		for (int i = 0; i < n.length; i++){
		   if(n[i] < 0){
		     negative = negative + 1;}
		}
      return negative;
	}
}