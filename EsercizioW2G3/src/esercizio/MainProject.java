package esercizio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainProject {

	public static void main(String[] args) {
			Logger log = LoggerFactory.getLogger(MainProject.class);
			
			Thread t1 = new ThreadClass("*");
			Thread t2 = new ThreadClass("!");
			
			t1.start();
			t2.start();
	}

}
