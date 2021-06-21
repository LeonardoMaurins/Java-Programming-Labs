import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		Vector<Sustenance> listOfFoods = new Vector<Sustenance>();
		
		listOfFoods.add(new Drink("Fast Food", "Fanta", 500));
		listOfFoods.add(new Food("Healthy", "Salad", 700));
		listOfFoods.add(new Drink("Classy", "Tea", 300));
		listOfFoods.add(new Food("Classy", "Spaghetti Bolognese", 1200));
		listOfFoods.add(new Drink("Healthy", "Orange Juice", 200));
		listOfFoods.add(new Food("Fast Food", "Pizza", 850));
		listOfFoods.add(new Drink("Classy", "Espresso", 150));
		listOfFoods.add(new Food("Fast Food", "Burger", 350));
		listOfFoods.add(new Drink("Healthy", "Water", 125));
		listOfFoods.add(new Food("Classy", "Risotto", 400));
			
		for (Sustenance sustenance : listOfFoods) {
			System.out.println(sustenance);
		}
	}

}
