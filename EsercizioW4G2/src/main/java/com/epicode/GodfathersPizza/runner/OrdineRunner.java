package com.epicode.GodfathersPizza.runner;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.epicode.GodfathersPizza.configuration.MenuConfiguration;
import com.epicode.GodfathersPizza.configuration.OrdineConfiguration;
import com.epicode.GodfathersPizza.model.Drink;
import com.epicode.GodfathersPizza.model.Ordine;
import com.epicode.GodfathersPizza.model.Pizza;
import com.epicode.GodfathersPizza.model.Tavolo;

@Component
public class OrdineRunner  implements CommandLineRunner  {

	static Map<Integer, Tavolo> listaTavoli = new HashMap<Integer, Tavolo>();
	static AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(OrdineConfiguration.class);
	static AnnotationConfigApplicationContext appMenuContext = new AnnotationConfigApplicationContext(MenuConfiguration.class);

	@Override
	public void run(String... args) throws Exception {
		System.out.println("RunOrdine..");	
		configTavoloWith_Bean();
		configOrdineWith_Bean();
		appContext.close();
		appMenuContext.close();

	}
	
	public void configTavoloWith_Bean() {

		System.out.println("******* Tavoli *******");
		Tavolo tavolo1 = (Tavolo) appContext.getBean("tavolo", 1, 4);
		Tavolo tavolo2 = (Tavolo) appContext.getBean("tavolo", 2, 2);
		Tavolo tavolo3 = (Tavolo) appContext.getBean("tavolo", 3, 6);

		listaTavoli.put(tavolo1.getNumeroTavolo(), tavolo1);
		listaTavoli.put(tavolo2.getNumeroTavolo(), tavolo2);
		listaTavoli.put(tavolo3.getNumeroTavolo(), tavolo3);
		
	}
	
	
	public void configOrdineWith_Bean() {

		Ordine ordine1 = (Ordine) appContext.getBean("ordine",1, listaTavoli.get(1), 2);
		Pizza margherita = (Pizza) appMenuContext.getBean("pizzaMargherita");
		Pizza salami = (Pizza) appMenuContext.getBean("pizzaSalami");
		Pizza maxSalami = (Pizza) appMenuContext.getBean("pizzaFamilySize", salami);
		
		Drink lemonade = (Drink) appMenuContext.getBean("drinkLemonade");
		Drink water = (Drink) appMenuContext.getBean("drinkWater");
		
		ordine1.getOrdinato().add(maxSalami);
		ordine1.getOrdinato().add(margherita);
		ordine1.getOrdinato().add(salami);
		ordine1.getOrdinato().add(water);
		ordine1.getOrdinato().add(lemonade);
		
		ordine1.getOrdinato().forEach(e -> System.out.println(e.getMenuItemLine()));               
		System.out.println(ordine1.getTotale());
	}
}
