/* To the class BinarySearchDemo add an overloaded version of the binarySearch method that applies to characters;
in the main method declare a char array and test the added method passing that array and a value that exists in the array;
repeat the test for a value that does not exist in the array. (Group Work)*/

public class binarySearchDemo{
  public static void main(String[] args){
    int arr [] = {1, 12, 8, 2, 9, 2, 20, 5};
    char data[] = {'a', 'b', 'c', 'd', 'e' };

    int a = binarySearch(arr, 8 );
    System.out.println((a != -1) ? ("key fouund at index " + a) : "key not found");

    int b = binarySearch(data, 'd' );
    System.out.println((b != -1) ? ("key fouund at index " + b) : "key not found");

    int c = binarySearch(data, 'f' );
    System.out.println((c != -1) ? ("key fouund at index " + c) : "key not found");
   }//end main method

  public static int binarySearch(int[] data, int key){

    int low = 0;
    int high = data.length -1;

    while(high >= low){ //while the higher balue is greater or equal to the low value

	  int middle = (low + high) / 2; //add the lowest and highest then divide by 2

	  if(data[middle] == key){
	     return middle;
	  }//end if

	  if(data[middle] < key){
	    low = middle + 1;
	  }
	  if(data[middle] > key){
	    high = middle - 1;
	  }
	}//end the while loop
	return -1;
   }

	public static int binarySearch(char data [], int key){
	    int low = 0;
	    int high = data.length -1;

	    while(high >= low){

		  int middle = (low + high) / 2;
		  if(data[middle] == key){

		     return middle;
		  }
		  if(data[middle] < key){
		    low = middle + 1;
		  }
		  if(data[middle] > key){
		    high = middle - 1;
		  }
		}
	return -1;
  }
}