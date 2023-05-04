package it.epicode.be;

import java.util.Iterator;
import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		//Esercizio #2
		System.out.println(moltiplica(4,3));
		System.out.println(concatena("davide",3));
		
		String es3 [] = {"ciao", "a", "tutti", "sono", "davide"};
		String es33 = "wewe";
		String [] returnArr = inserisciInArray (es3, es33);
		for (int i = 0; i < returnArr.length; i++) {
			System.out.println(returnArr[i]);
		}
		
		esercizio3();
		System.out.println(esercizio4(3.34, 4.22));		
			
		System.out.println(esercizio6(3.34, 4.22));		
		}

public static int moltiplica(int n1, int n2) {
	return n1 * n2;
};
public static String concatena(String es2, int es22) {
	return es2 + es22;
};
public static String[] inserisciInArray(String es3 [], String es33) {
	String result [] = {es3[0] + es3[1] + es3[2] + es33 + es3[3] + es3[4]};
	return result;
}
public static void esercizio3() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Inserisci la prima parola: ");
	String parola1 = sc.nextLine();
	System.out.print("Inserisci la seconda parola: ");
	String parola2 = sc.nextLine();
	System.out.print("Inserisci la terza parola: ");
	String parola3 = sc.nextLine();
	System.out.println(parola1 + " " + parola2 + " " + parola3);
	System.out.println(parola3 + " " + parola2 + " " + parola1);
	return;
}

public static double esercizio4(double es4, double es44) {
	return (es4 + es44) * 2;
}

public static int esercizio5(int es5) {
	return es5 % 2;
}

public static double esercizio6 (double es6, double es66) {
	return (es6 * es66) / 2;
}

}



