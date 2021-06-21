
public class TestAList
{
	public static void main(String args[])
	{
		ListReferenceBased list = new ListReferenceBased();
		
		list.add(1, 100);
		list.add(2, 200);
		list.add(3, 300);
		
		System.out.println("Is the list empty: " + list.isEmpty());
		System.out.println("How big the list is: " + list.size());
		
		list.remove(2);
		
		System.out.println("Is the list empty: " + list.isEmpty());
		
		list.add(2, 400);
		
		ListReferenceBased.displayList(list);
		ListReferenceBased.listLargest(list);
	}

}