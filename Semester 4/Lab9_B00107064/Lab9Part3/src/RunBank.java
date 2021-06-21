
public class RunBank {

    public static void main(String args[])
    {
        for(int index = 0; index < 1000; ++index) {
        	new BankTransaction().start();
        }   
    }
}
