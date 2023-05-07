package Esercizio;
  
import java.util.Scanner;

public class MainProject {

	static Scanner nomeFile = new Scanner(System.in);
	static ElementoMultimediale[] arr = new ElementoMultimediale [5];
	
	public static void main(String[] args) {
		
			System.out.println("Benvenuto nel tuo player multimediale, importa 5 file per ottenere una playlist (video/audio/immagini)");
			richiestaFile();
			mostraElemento();
			nomeFile.close();
	}
	
	public static void richiestaFile() {
		String [] ordine = {"primo", "secondo", "terzo", "quarto", "quinto"};
		for (int i= 0; i < 5; i++) {
			System.out.print("Inserisci il " + ordine[i] + " file : ");
			aggiungiElemento(nomeFile.nextLine());
			}
	}
	
	public static void aggiungiElemento(String nome) {
		switch (nome) {
		case "video":{
			System.out.print("Inserisci il titolo: ");
			String titolo = nomeFile.nextLine();
			System.out.print("Inserisci la durata: ");
			String durata = nomeFile.nextLine();
			System.out.print("Inserisci il volume: ");
			String volume = nomeFile.nextLine();
			System.out.print("Inserisci la lumionisità: ");
			String luminosità = nomeFile.nextLine();
			ElementoMultimediale e = new Video(titolo, durata, volume, luminosità);
			inserisciArray(e);
			break;
		}
		case "audio":{
			System.out.print("Inserisci il titolo: ");
			String titolo = nomeFile.nextLine();
			System.out.print("Inserisci la durata: ");
			String durata = nomeFile.nextLine();
			System.out.print("Inserisci il volume: ");
			String volume = nomeFile.nextLine();
			ElementoMultimediale e = new RegistrazioneAudio(titolo, durata, volume);
			inserisciArray(e);
			break;
		}
		case "immagine":{
			System.out.print("Inserisci il titolo: ");
			String titolo = nomeFile.nextLine();
			System.out.print("Inserisci la lumionisità: ");
			String luminosità = nomeFile.nextLine();
			ElementoMultimediale e = new Immagine(titolo, luminosità);
			inserisciArray(e);
			break;
		}
		
		default : 
			System.out.println("Errore nella dicitura, ti invitiamo a riscriverli!");
			richiestaFile();	
		}	
	}
	
	public static void inserisciArray(ElementoMultimediale e) {
		for (int i = 0; i< arr.length; i++) {
		if(arr[i] == null) {
			arr[i] = e;
			break;
		} 
		}
	}
	
	public static void mostraElemento () {
		for (int i = 0; i < 6; i++) {
			System.out.print("Inserisci l'elemento da visionare: ");
			int numero = nomeFile.nextInt();
			switch (numero) {
			case 1 : {tipoElemento(0); break;}
			case 2 : {tipoElemento(1); break;}
			case 3 : {tipoElemento(2); break;}
			case 4 : {tipoElemento(3); break;}
			case 5 : {tipoElemento(4); break;}
			case 0 : break;
			default:
				System.out.println("wewe");
			}
		}
	}
	
	public static void tipoElemento(int x) {
		if (arr[x] instanceof Video) {
					Video v = (Video) arr[x];
					v.play();
				} else if (arr[x] instanceof RegistrazioneAudio) {
					RegistrazioneAudio r = (RegistrazioneAudio) arr[x];
					r.play();
				} else if (arr[x] instanceof Immagine) {
					Immagine imm = (Immagine) arr[x];
					imm.show();
				}
	}
}
