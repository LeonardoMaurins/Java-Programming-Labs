// Real internet connection that prints the passed serverhost
public class RealInternet implements Internet {
	@Override
	public void connectTo(String serverhost) {
		System.out.println("Connecting to " + serverhost);
	}
}
