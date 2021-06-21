/*The bubble sort for an array of double values to sort the array in decreasing order (from largest to smallest);
The selection sort for an array of double values to sort the array in decreasing order (from largest to smallest);*/

public class DescendingAlgorithms{
	public static void main (String[]args){

		//Selection sort
		double selectValues [] = new double[]{3.4, 2.1, 9.5, 6.0};
		bubble(selectValues);

		for(int i = 0; i < selectValues.length; i++){
			System.out.print(selectValues[i]+" ");//prints out the sorted bubble values
		}//end for

		//Bubble sort
		double bubbleValues [] = new double[]{0.2, 10.4, 3.9, 2.5};//array of double values for selection sort
		selection(bubbleValues);
		System.out.println(" ");

		for(int b = 0; b < bubbleValues.length; b++){
			System.out.print(bubbleValues[b]+" ");//prints second array sorted by selection method
		}
		System.out.println(" ");
	}//close main method


		//bubble sort
    public static void bubble(double[] newValues){//open bubble method
		int n = newValues.length;
		double num = 0;
		for(int i = 0; i < n-1; i++){
			for(int c = 1; c < n; c++){
				if(newValues [c-1] < newValues[c]){
					num = newValues[c-1];
					newValues [c-1] = newValues[c];
					newValues[c] = num;}  //close if
			}//close inner for
		}//close outer for
    }//bubble method closed

    public static void selection(double[] newValues){//selection opened
		int n = newValues.length; //declares n to be equal to the length of the array
		for(int i = n-1; i > 0; i--){
			int index=0;
			for(int c = 1; c <= i; c++){
				if(newValues[c] < newValues[index]){
					index = c;}//close if

			double smallestNum = newValues[index];
			newValues[index] = newValues[i];
			newValues[i] = smallestNum;
			}//end inner for
		}//end outer for
	}//end selection

}//end class





		//selection sort


