import java.util.*;

public class ShopApp{
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);

		ArrayList<String> shopList = new ArrayList<String>();
        shopList.add("Eggs");
        shopList.add("Oranges");
        shopList.add("Smoked Ham");
        shopList.add("Bread");
        shopList.add("Lettuce");

        System.out.println("Your shopping list is: " + shopList);
		System.out.println("Size of list is now: " + shopList.size());
		System.out.println();

		shopList.set(2, "Cured Ham");
		System.out.println("After correcting the mistake: " + shopList);
		System.out.println();

		shopList.remove(1);
		System.out.println("Sorry we are now out of oranges");
		System.out.println("Your shopping list is now: " + shopList);
		System.out.println();

		System.out.println("Our broccoli has just arrived..let's add it to the list!");
		shopList.add(0, "Broccoli");
		System.out.println("Your shopping list is now: " + shopList);
	}
}



