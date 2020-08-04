
public class StopWatch {
	private boolean running = false;
	private boolean start = false;
	private boolean stop = false;
	
	public boolean start(){
		if(!running||stop)
		{
			start = true;
			running = true;
			return true;
		}
		return false;
	}
	
	public boolean stop(){
		if(running){
			start = false;
			running = false;
			stop = true;
			return true;
		}
		return false;
	}
}
