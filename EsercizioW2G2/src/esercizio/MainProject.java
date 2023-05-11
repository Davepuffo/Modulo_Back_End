package esercizio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainProject {
	
	static Scanner sc = new Scanner(System.in);
	static Logger log = LoggerFactory.getLogger(MainProject.class);

	public static void main(String[] args) {
		Esercizio1();
		
	}
	public static void Esercizio1() {
		Set<String> s = new HashSet<String>();
		
		System.out.println("Inserisci il numero di elementi:");
		int numeroElementi = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < numeroElementi; i++) {
			System.out.print("Inserisci una parola:");
			String parola = sc.nextLine();
			s.add(parola);
		}
		
		log.info("La lunghezza del Set è: " + s.size());
		s.forEach(e -> log.info(e));
	}
}
