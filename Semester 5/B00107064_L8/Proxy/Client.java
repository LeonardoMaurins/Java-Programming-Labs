public class Client {
	// Private internet variable
	private static ProxyInternet internet;

	// main method for declaring internet as object
	// attempting to connect to urls
	public static void main(String[] args) {
		internet = new ProxyInternet();
		try {
			internet.connectTo("tudublin.ie");
			internet.connectTo("abc.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
