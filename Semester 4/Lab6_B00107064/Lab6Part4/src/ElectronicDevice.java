
public abstract class ElectronicDevice {

	protected String manufacturer;
	
	public ElectronicDevice(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

	@Override
	public String toString() {
		return "ElectronicDevice [manufacturer=" + manufacturer + "]";
	}
	
}

