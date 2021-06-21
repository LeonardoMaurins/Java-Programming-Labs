
public class WalkieTalkie extends HandHeldDevice{

	protected double rangeInKm;
	
	public WalkieTalkie(String manufacturer, double weight, double rangeInKm) {
		super(manufacturer, weight);
		this.rangeInKm = rangeInKm;
	}
	
	public double getRangeInKm() {
		return rangeInKm;
	}

	@Override
	public String toString() {
		return "WalkieTalkie [rangeInKm=" + rangeInKm + ", Subclass of " + super.toString() + "]";
	}
	
}

