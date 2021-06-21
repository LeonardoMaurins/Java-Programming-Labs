import java.io.IOException;
import java.util.logging.*;

public class Revision1 {

    public static void main(String[] args) throws SecurityException, IOException {

        int[] numArray = new int[2];

        Logger logException = Logger.getLogger("ArrayIndexOutOfBoundsException.Exception.Error");

        try {
            System.out.println(numArray[3]);
        } 
        catch(ArrayIndexOutOfBoundsException e) {
            Handler fileOut = new FileHandler("exceptionLog.txt", true);
            fileOut.setFormatter(new SimpleFormatter());
            logException.addHandler(fileOut);
            logException.log(Level.SEVERE, "This array was out of bounds", e.getMessage());
        }
    }

}