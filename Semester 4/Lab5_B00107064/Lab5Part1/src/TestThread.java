
public class TestThread {

	public static void main(String[] args) {
		
		Thread t1 = new ThreadWithExtends(0);
		Thread t2 = new ThreadWithExtends(1);
		Thread t3 = new ThreadWithExtends(2);
		
		t1.start(); 
		t2.start(); 
		t3.start(); 
	}
}
