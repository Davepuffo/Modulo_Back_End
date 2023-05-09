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
	
	public static List numeriCasuali (int x) {
		for (int i= 0; i< x ; i++) {
			int numero = (int) (Math.random() * 100);
			l.add(numero);
		}
		System.out.println("I numeri casuali sono:");
		l.forEach(e -> System.out.println(e));

		return l;	
	}
	
	public static List mescolaNumeri (List l) {
		li.addAll(l);		
		Collections.shuffle(l);
		li.addAll(l);
		System.out.println("I numeri casuali più quelli mescolati  sono:");
		li.forEach(e -> System.out.println(e));		
		return li;
	}
	
	public static void numeriPariDispari (List l, boolean v) {
		if (v == true) {
			System.out.println("Numeri pari");
			for(int i = 0; i < l.size(); i++) {
				int r = (int) l.get(i);
				if(r % 2 == 0) {
					System.out.println(r);
				}
			}			
		} else {
			System.out.println("Numeri dispari");
			for(int i = 0; i < l.size(); i++) {
				int r = (int) l.get(i);
				if(r % 2 != 0) {
					System.out.println(r);
				}
			}
		}
	}
}
