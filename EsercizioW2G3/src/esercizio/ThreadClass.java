package esercizio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadClass extends Thread {
	
	private String message;
	Logger log = LoggerFactory.getLogger(ThreadClass.class);

	
	public ThreadClass (String message) {
		this.message = message;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				System.out.println(this.message);
				Thread.sleep(1000);
			} catch (Exception e) {
				log.error(e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
}
