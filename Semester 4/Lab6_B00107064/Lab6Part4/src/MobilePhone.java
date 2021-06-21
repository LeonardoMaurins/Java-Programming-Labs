
public class MobilePhone extends HandHeldDevice{

	protected String networkName;
	
	public MobilePhone(String manufacturer, double weight, String networkName) {
		super(manufacturer, weight);
		this.networkName = networkName;
	}
	
	public String getNetowrkName() {
		return networkName;
	}

	@Override
	public String toString() {
		return "MobilePhone [networkName=" + networkName + ", Subclass of " + super.toString() + "]";
	}
	
	
}

