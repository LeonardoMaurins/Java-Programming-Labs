
public class ThreadWithExtends extends Thread{

	private static String[] abcArray = {"A","B","C"};
	
	private int index;
	
	public ThreadWithExtends(int index) {
		this.index = index;
	}

	public void run() {
		for(int i = 0;i<10;i++) {
			System.out.println(abcArray[this.index]);
		}
	}
	
}
