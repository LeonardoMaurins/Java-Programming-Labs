import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Week05Problem07

{
	public static void main(String[] args)
	{
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(13);
		myList.add(48);
		myList.add(5);
		myList.add(82);
		myList.add(27);
		myList.add(102);
		myList.add(13);
		myList.add(54);
		myList.add(91);
		myList.add(33);

		Collections.sort(myList);

		for (int element : myList)
		{
		    System.out.println(element);
		}
	}
}