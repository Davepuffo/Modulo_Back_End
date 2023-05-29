package com.esercizio.W4E1.esercizio.W4E1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Configurations.ConfigurationBibite;
import Configurations.ConfigurationOggettistica;
import models.Bibite;
import models.Oggettistica;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		configuraBibite();
		configuraOggetti();
		
	}
	
	
	
	
	
	
	public static void configuraBibite() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationBibite.class);
		
		Bibite b1 = (Bibite) appContext.getBean("bibita", "Lemonade (0,33l)", 128, 1.29);
		System.out.println(b1.readBibita());
		Bibite b2 = (Bibite) appContext.getBean("bibita", "Water (0,5l)", 0, 1.29);
		System.out.println(b2.readBibita());
		Bibite b3 = (Bibite) appContext.getBean("bibita", "Wine (0,75l, 13%)", 607, 7.49);
		System.out.println(b3.readBibita());

		appContext.close();
	}
	
	
	public static void configuraOggetti() {
		AnnotationConfigApplicationContext appContext2 = new AnnotationConfigApplicationContext(ConfigurationOggettistica.class);

		Oggettistica o1 = (Oggettistica) appContext2.getBean("oggetto", "Shirt", 21.99);
		System.out.println(o1.readOggetti());
		Oggettistica o2 = (Oggettistica) appContext2.getBean("oggetto", "Mug", 4.99);
		System.out.println(o2.readOggetti());
		
		appContext2.close();
	}
}
