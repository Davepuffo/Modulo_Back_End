package esercizio2;

import java.util.Scanner;

public class MainProject2 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Inserire i km percorsi:");
		int kmPercorsi = Integer.parseInt(sc.nextLine());
		System.out.println("Inserire i litri utilizzati:");
		int litriUtilizzati = Integer.parseInt(sc.nextLine());
	
		System.out.println("Il consumo è di " + kmPercorsi/litriUtilizzati);			
		
	}

}
