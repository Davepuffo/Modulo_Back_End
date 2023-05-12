package esercizio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainProject {
	
	static List<Elemento> Archivio = new ArrayList<Elemento>();

	public static void main(String[] args) {
		
		Libro l1 = new Libro("L001", "Melos", 2013, 256, "Adamoli", "d");
		Libro l2 = new Libro("L002", "Devozione popolare", 2014, 467, "Casini", "d");
		Libro l3 = new Libro("L003", "Scoprire patresi", 2017, 126, "Ferrini", "d");

		Rivista r1 = new Rivista("R001", "Gazzetta dello sport", 2023, 21, Periodicità.SETTIMANALE );
		Rivista r2 = new Rivista("R002", "Quattroruote", 2023, 40, Periodicità.MENSILE );
		Rivista r3 = new Rivista("R003", "Topolino", 2020, 28, Periodicità.SEMESTRALE );
		
		aggiungiElemento(l1);
		aggiungiElemento(l2);
		aggiungiElemento(l3);
		aggiungiElemento(r1);
		aggiungiElemento(r2);
		aggiungiElemento(r3);
		
		//rimuoviElemento("L001");
		
		for (Elemento parola1 : Archivio) {
			System.out.println("  - " + parola1);
		}
		
		List<Elemento> filtroPerCodice = ricercaPerISBN("R001");
		for (Elemento parola1 : filtroPerCodice) {
			System.out.println("  - filtro " + parola1);
		}
		
		List<Elemento> filtroPerAnno = ricercaPerAnno(2023);
		for (Elemento parola2 : filtroPerAnno) {
			System.out.println("  - filtro anno " + parola2);
		}
		


		

	}

	public static void aggiungiElemento (Elemento e) {
		Archivio.add(e);
	}
		
	
	public static void rimuoviElemento (String codice) {
		for (Elemento e : Archivio) {
			if(e.getCodiceISBN() == codice) {
				Archivio.remove(e);
			}
		}
	}
	
	public static List<Elemento> ricercaPerISBN (String codice) {
		return Archivio.stream()
				.filter(e -> e.getCodiceISBN().equals(codice))
				.collect(Collectors.toList());
	}
	
	public static List<Elemento> ricercaPerAnno (int anno) {
		return Archivio.stream()
				.filter(e -> e.getAnno() == anno)
				.collect(Collectors.toList());
	}
	
}
