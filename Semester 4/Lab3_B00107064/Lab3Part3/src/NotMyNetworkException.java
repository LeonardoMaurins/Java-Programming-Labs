
public class NotMyNetworkException extends Exception {

	private static final long serialVersionUID = 1L;

	public NotMyNetworkException(String message) {
		super(message + " is not the correct network!");
	}

}
