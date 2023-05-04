package esercizio;

import java.util.Scanner;

public class Esercizio4 {

	int numero;
	
	public void contoRovescia() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Inserisci un numero: ");
	numero = sc.nextInt();
	for (int i = numero; i>=0; i--) {
		System.out.println(i);
	}
	}
}
