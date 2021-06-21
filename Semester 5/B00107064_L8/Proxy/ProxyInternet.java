import java.util.ArrayList;
import java.util.List;

// ProxyInternet class used for accessing the internet
// object without other clients knowing
public class ProxyInternet implements Internet {
	private RealInternet internet = new RealInternet();
	private static List<String> bannedSites;

	// An object arraylist for banned sites
	static {
		bannedSites = new ArrayList<String>();
		bannedSites.add("abc.com");
		bannedSites.add("def.com");
		bannedSites.add("ijk.com");
		bannedSites.add("lnm.com");
	}

	// A method that's called for connecting to websites
	// And denying if on the banned list
	@Override
	public void connectTo(String serverhost) throws Exception {
		if (bannedSites.contains(serverhost.toLowerCase())) {
			throw new Exception("Access Denied " + serverhost);
		}
		internet.connectTo(serverhost);
	}
}
