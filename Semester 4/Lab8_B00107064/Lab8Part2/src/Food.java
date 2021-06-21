
public class Food extends Sustenance {

	String foodKind;
	
	public Food(String sustenanceType, String foodKind, int weight) {
		super(sustenanceType, weight);
		this.foodKind = foodKind;
	}

    @Override
    public String toString()
    {
        return "Food (" + "Food Type = " + sustenanceType + ", Food Kind = " + foodKind + ", Grams = " + weight + "g)";
    }
}
