
import java.io.*;

public class ScreenAdapter extends Screen{
	// Receives an int from Client or AdapterTest converts
	// to string and sends to the super class Screen
	public void writeInt(int i)	{
		super.writeInt(new String(Integer.toString(i)));
	}
}
