
public class ThreadColoring extends Thread{

	private StopTheLights stopTheLights;
	private boolean running;
	
	public ThreadColoring(StopTheLights stopTheLights) {
		this.stopTheLights = stopTheLights;
	}
	
	public void run() {
		this.running = true;
		
		while(this.running) {
			
			if(stopTheLights.redLight) {
				stopTheLights.redLight = false;
				stopTheLights.amberLight = true;
			}
			else if(stopTheLights.amberLight) {
				stopTheLights.amberLight = false;
				stopTheLights.greenLight = true;
			}
			else if(stopTheLights.greenLight) {
				stopTheLights.greenLight = false;
				stopTheLights.redLight = true;
			}
			
			stopTheLights.repaint();
			
			try {
				sleep(500);
			} catch(InterruptedException e) {
				this.running = false;
			}
		}
		
		stopTheLights.redLight = false;
		stopTheLights.amberLight = false;
		stopTheLights.greenLight = false;
		stopTheLights.repaint();
		
		System.out.println("Thread End");
	}
	
	public void stopThread() {
		this.running = false;
	}
	
	public boolean isRunning() {
		return this.running;
	}
}
