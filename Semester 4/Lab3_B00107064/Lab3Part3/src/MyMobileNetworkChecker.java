import java.util.Scanner;

/**
 * 
 * This class prompts the user to enter a network from three written choices
 * if the network isn't correct, it throws the custom NotMyNetworkException
 * from the NotMyNetworkException class. If correct then it prints so.
 * 
 * @return	inputNetwork: Returns this value to show the network that was typed.
 */

public class MyMobileNetworkChecker {

	public static void main(String[] args) throws NotMyNetworkException {
		
		Scanner sc = new Scanner(System.in);
			
		try {
			System.out.print("Enter a network(Vodaphone, Three, Eir): ");
			String network = sc.nextLine();
			checkMyMobileNetwork(network);
		} catch (NotMyNetworkException e) {			
			e.printStackTrace();
		}		
		sc.close();
	}

	
	public static String checkMyMobileNetwork(String inputNetwork) throws NotMyNetworkException {
		
		String myNetwork = "Three";
		
		if(inputNetwork.equals(myNetwork)) {
			System.out.println("The network " + myNetwork + " is correct!");
		}
		else {
			throw new NotMyNetworkException(inputNetwork);
		}		
		return inputNetwork;
	}
}
