
public class TestAList
{
	public static void main(String args[])
	{
		ListArrayBased list = new ListArrayBased();
		
		list.add(1, "One");
		list.add(2, "Two");
		list.add(3, "Three");
		
		System.out.println("Is the list empty: " + list.isEmpty());
		System.out.println("How big the list is: " + list.size());
		
		list.remove(2);
		
		System.out.println("Is the list empty: " + list.isEmpty());
		
		list.add(2, "New Two");
		
		displayList(list);
	}

	public static void displayList(ListArrayBased list)
	{
		for(int i = 1; i <= list.size(); i++) {
			System.out.println("Items: " + list.get(i));
		}
	}

}