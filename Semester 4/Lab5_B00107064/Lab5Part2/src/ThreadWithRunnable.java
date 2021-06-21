
public class ThreadWithRunnable implements Runnable{

	private static int[] intArray = new int[] {1,2,3};
	
	private int index;
	
	public ThreadWithRunnable(int index) {
		this.index = index;
	}

	public void run() {
		for(int i = 0;i<10;i++) {
			System.out.println(intArray[this.index]);
		}
	}
	
}
