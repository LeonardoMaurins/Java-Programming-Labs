
public class Drink extends Sustenance {

	String drinkKind;
	
	public Drink(String sustenanceType, String drinkKind, int weight) {
		super(sustenanceType, weight);
		this.drinkKind = drinkKind;
	}

    @Override
    public String toString()
    {
        return "Drink (" + "Drink Type = " + sustenanceType + ", Drink Kind = " + drinkKind + ", Mililitres = " + weight + "ml)";
    }
}
