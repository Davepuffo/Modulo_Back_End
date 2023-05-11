package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainProject {
	
	static Logger log = LoggerFactory.getLogger(MainProject.class);
	static List <Integer> l = new ArrayList<Integer>();
	static List <Integer> li = new ArrayList<Integer>();

	public static void main(String[] args) {
		numeriCasuali(5);
		mescolaNumeri(l);
		numeriPariDispari(l, false);
	}
	
	public static List <Integer> numeriCasuali (int x) {
		for (int i= 0; i< x ; i++) {
			int numero = (int) (Math.random() * 100);
			l.add(numero);
		}
		System.out.println("I numeri casuali sono:");
		l.forEach(e -> System.out.println(e));

		return l;	
	}
	
	public static List <Integer> mescolaNumeri (List <Integer> l) {
		li.addAll(l);
		for (int i = l.size()-1; i >= 0 ; i--) {
			li.add(l.get(i));
		}
		System.out.println("I numeri casuali più quelli mescolati sono:");
		li.forEach(e -> System.out.println(e));		
		return li;
	}
	
	public static void numeriPariDispari (List l, boolean v) {
		if (v == true) {
			System.out.println("Numeri pari");
			for(int i = 0; i < l.size(); i+=2) {
				System.out.println(l.get(i));
			}			
		} else {
			System.out.println("Numeri dispari");
			for(int i = 1; i < l.size(); i+=2) {
				System.out.println(l.get(i));
			}
		}
	}
}
