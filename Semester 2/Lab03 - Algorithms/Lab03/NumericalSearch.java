/*Linear search for an array of integers.
Linear search for an array of doubles.*/
import java.util.Scanner;
public class NumericalSearch{
	public static void main(String[]args){
		Scanner scan = new Scanner (System.in);

		//First method and invoke
		int listNum[] = new int[]{12, 2, 16, 1, 9};
		System.out.print("The numbers in your int array are: ");

    	for(int n = 0; n < listNum.length; n++){
			System.out.print(listNum[n] + " ");
		}//end for
		System.out.println(" ");
    	System.out.println("Enter your int to find the index: ");
    	int keySearch = scan.nextInt();
    	System.out.println("The index is: " + linearSearch (listNum, keySearch));

    	//Second method and invoke
		double listNum2[] = new double[] {3.7, 9.0, 25.4, 1.5, 0.1};
	    System.out.print("The numbers in your double array are: ");

		for(int n = 0; n < listNum2.length;n++){
			System.out.print(listNum2[n] + " ");
		}//end for
		System.out.println(" ");
	    System.out.println("Enter your double to find the index: ");
	    double keySearch2 = scan.nextDouble();
	    System.out.println("The index is: " + linearSearch2 (listNum2,keySearch2));
	}//close main method


	//First method
	public static int linearSearch (int listNum[], int keySearch){
		for(int i = 0; i < listNum.length; i++){
	    	if(listNum[i] == keySearch)
	    	    return i;
	    }//end for
	    return -1;
	}//end method

	public static int linearSearch2(double listNum2[], double keySearch2){
		for(int i = 0; i < listNum2.length;i++){
		  if(listNum2[i] == keySearch2)
		   	return i;
		}//end for
		return -1;
	}//end method
}//end main
