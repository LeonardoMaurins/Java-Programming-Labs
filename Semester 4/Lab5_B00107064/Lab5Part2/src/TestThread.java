
public class TestThread {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThreadWithRunnable(0));
		Thread t2 = new Thread(new ThreadWithRunnable(1));
		Thread t3 = new Thread(new ThreadWithRunnable(2));
		
		t1.start(); 
		t2.start(); 
		t3.start(); 
	}
}
