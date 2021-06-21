import java.io.*;

// The class extends FilterInputStream and implements a readLine function
public class StreamDecorator extends FilterInputStream {
    // initializes a final int value
	final int MAX=1000;
	
	// Constructor that receives the inputStream f value
	// and passes it to the parent class
    public StreamDecorator(InputStream f) {
        super(f);
    }

    // A string method which reads text and declares it
    public String readLine() {
        String s;
        int length = 0;

        byte b[] = new byte[MAX];
        try {
            length = super.read(b);
            s = new String(b, 0, length);
        } catch (IOException e) {
            s = "";
        }
        
        // The string buffer builds the passed string to it
        StringBuffer buf = new StringBuffer(s);
        boolean punctFound = true;
        for (int i=0; i < length; i++) {
            char ch = buf.charAt (i);
            if (punctFound && (ch != ' ') ) {
                ch = Character.toUpperCase (ch);
                buf.setCharAt (i, ch);
                punctFound = false;
            }
            if (ch == '.' || ch == '\n')
                punctFound = true;
        }
        s = buf.toString ();
        return s;
    }
}
