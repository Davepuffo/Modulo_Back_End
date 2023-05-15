package esercizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

import java.io.File;
import java.io.IOException;

public class MainProject {
	
	static List<Elemento> Archivio = new ArrayList<Elemento>();
	
	static File file = new File("listaArticoli/articoli.txt");
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		Libro l1 = new Libro("L001", "Melos", 2013, 256, "Adamoli", "d");
		Libro l2 = new Libro("L002", "Devozione popolare", 2014, 467, "Casini", "d");
		Libro l3 = new Libro("L003", "Scoprire patresi", 2017, 126, "Ferrini", "d");

		Rivista r1 = new Rivista("R001", "Gazzetta dello sport", 2023, 21, Periodicità.SETTIMANALE );
		Rivista r2 = new Rivista("R002", "Quattroruote", 2023, 40, Periodicità.MENSILE );
		Rivista r3 = new Rivista("R003", "Topolino", 2020, 28, Periodicità.SEMESTRALE );
		Rivista r4 = new Rivista("R003", "Topolino", 2020, 28, Periodicità.SEMESTRALE );

		
		aggiungiElemento(l1);
		aggiungiElemento(l2);
		aggiungiElemento(l3);
		aggiungiElemento(r1);
		aggiungiElemento(r2);
		aggiungiElemento(r3);
		aggiungiElemento(r4);
		//rimuoviElemento("L001");
		

		try {
			List<Elemento> filtroPerCodice = ricercaPerISBN("R001");
			System.out.println("Ricerca per codice ISBN:");
			for (Elemento parola1 : filtroPerCodice) {
				System.out.println("  - " +parola1);
			}
			
			List<Elemento> filtroPerAnno = ricercaPerAnno(2023);
			System.out.println("Ricerca per anno:");
			for (Elemento parola2 : filtroPerAnno) {
				System.out.println("  - " + parola2);
			}
			
			List<Libro> filtroPerAutore = ricercaPerAutore("Adamoli");
			System.out.println("Ricerca per autore:");
			for (Elemento parola2 : filtroPerAutore) {
				System.out.println("  - " + parola2);
			}
			
			scriviFile();
			System.out.println("----------------------------------------------------------------------------------------------------------------");
			System.out.println("Tutti gli elementi presenti nell'archivio sono:");
			leggiFile();			
		} catch (IOException e) {
			e.printStackTrace();
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
	
	public static List<Libro> ricercaPerAutore (String autore){
		List <Libro> filtroLibro = new ArrayList<Libro>();
		Object[] arr = Archivio.toArray();
		for (int i = 0; i < Archivio.size(); i++) {
			if(arr[i] instanceof Libro) {
				filtroLibro.add((Libro) arr[i]);
			}
		}

		return filtroLibro.stream()
				.filter(e -> e.getAutore().equals(autore))
				.collect(Collectors.toList());
	}
	
	public static void scriviFile() throws IOException {
		if(file.exists()) {
			cancellaFile();
			for (Elemento a : Archivio) {
				String app = a.toString();
				FileUtils.writeStringToFile(file, app , "UTF-8", true);
			}
			} else {
			for (Elemento a : Archivio) {
				String app = a.toString();
				FileUtils.writeStringToFile(file, app , "UTF-8", true);
			}
		}
	}
	
	public static void leggiFile() throws IOException {
		if (file.exists()) {
			String lettura =  FileUtils.readFileToString(file, "UTF-8");
			String[] lettura1 = lettura.split("! ");
			for (String a : lettura1){
				System.out.println(a);				
			}
			return;
		}
		System.out.println("Non è presente nessun file di dati!");
		return;
	}
	
	public static void cancellaFile() throws IOException {
		FileUtils.deleteQuietly(file);
	}
	
}
