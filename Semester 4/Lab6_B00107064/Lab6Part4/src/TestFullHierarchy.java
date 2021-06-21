import java.util.Vector;

public class TestFullHierarchy {

	private static Vector<ElectronicDevice> deviceList = new Vector<ElectronicDevice>();
	
	public TestFullHierarchy() {
		deviceList = new Vector<ElectronicDevice>();
	}

	public static void addToDeviceList() {
		
		HandHeldDevice device1 = new HandHeldDevice("Samsung", 1.5); // Manufacturer, Weight
		Computer device2 = new Computer("Lenovo", 12, 4.2, 15.6, 500); // Manufacturer, Weight, ComputerSpeed, ScreenSize, Storage
		LaptopComputer device3 = new LaptopComputer("HP", 3, 4.2, 15.6, 500, 6); // Manufacturer, Weight, ComputerSpeed, ScreenSize, Storage, BatteryLife
		WalkieTalkie device4 = new WalkieTalkie("Lynn", 2.5, 15); // Manufacturer, Weight, RangeInKM
		MobilePhone device5 = new MobilePhone("OnePlus", 1.5, "Eir"); // Manufacturer, Weight, Network
		
		deviceList.add(device1);
		deviceList.add(device2);
		deviceList.add(device3);
		deviceList.add(device4);
		deviceList.add(device5);
	}
	
	public Vector<ElectronicDevice> getDeviceList() {
		return deviceList;
	}
	
	public static void main(String[] args) {
		
		addToDeviceList();		
		
		for(int i = 0;i < deviceList.size(); i++) {
			ElectronicDevice select = (ElectronicDevice) deviceList.elementAt(i);
			System.out.println(select);
		}	
	}//end main
}
