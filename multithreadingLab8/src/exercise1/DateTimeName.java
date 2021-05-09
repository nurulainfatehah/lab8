package exercise1;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeName extends Thread {

	
	
	public void printDateTimeName(String threadName) {
		try {
			
			for (int counter = 0; counter < 10; counter++) {
	
				Date date = new Date();
				SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
				
				System.out.println("> Current datetime: " + formatter.format(date));
				System.out.println("> Current thread is -----> " + threadName + "\n");
				
				
			}
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		printDateTimeName( currentThread.getName());
		
	}
	
}
