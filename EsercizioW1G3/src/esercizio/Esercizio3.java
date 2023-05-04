package esercizio;

import java.util.Scanner;

public class Esercizio3 {

	public String parola;
	
	public void trovaQ() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci un parola: ");
		parola = sc.nextLine();
		
		String [] s = parola.split("");
		
		for (int i = 0; i < s.length; i++) {
			if(s[i] != "q") {
			System.out.println(s[i] + ",");
			} else {
				break;
			}
		}
		
	}
	
	
}
