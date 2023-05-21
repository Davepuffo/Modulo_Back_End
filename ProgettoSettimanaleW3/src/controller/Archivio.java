package controller;

import java.time.LocalDate;
import java.util.List;

import dao.ElementoDAO;
import dao.PrestitoDAO;
import dao.UtenteDAO;
import model.Elemento;
import model.Libro;
import model.Prestito;
import model.Utente;

public class Archivio {

	public static void main(String[] args) {

		Libro l1 = new Libro("libro bellissimo", 1945, 26, "Gianni", "Comedy");
		Libro l2 = new Libro("roccaforte", 2011, 72, "Franco", "Horror");
		Libro l3 = new Libro("bracciodestro", 2011, 35, "Diego", "Documentario");
		
		Utente u1 = new Utente("Valentino", "Rossi", LocalDate.of(1995, 2, 3));
		Utente u2 = new Utente("Franco", "Verdi", LocalDate.of(1987, 4, 5));
		

		//UtenteDAO ud1 = new UtenteDAO();
		//ud1.save(u2);
		
		ElementoDAO ed1 = new ElementoDAO();
		//ed1.save(l3);
		//Elemento e = ed1.getByISBN(3);
		//System.out.println(e);
		
		//List <Elemento> ricAutore = ed1.getByTitle("a");
		//ricAutore.forEach(e -> System.out.println(e));
		
		Prestito p1 = new Prestito(LocalDate.of(2021, 2, 2), u2, l1);
		Prestito p2 = new Prestito(LocalDate.of(2022, 3, 2), u1, l2);
		Prestito p3 = new Prestito(LocalDate.of(2023, 5, 20), u1, l3);

		PrestitoDAO pd1 = new PrestitoDAO();
		//pd1.save(p3);
		
		List<Prestito> prestito = pd1.elementiInPrestito(6);
		prestito.forEach(e -> System.out.println(e));
		
		List<Prestito> prestito1 = pd1.elementiScaduti();
		prestito1.forEach(e -> System.out.println(e));
		
		
	}

}
