package esercizio;

import java.util.Random;
import java.util.Scanner;

public class MainProject {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int arrInteri [] = arrayNInteri();
		stampaArray(arrInteri);
		inserisciNumero(arrInteri);
	}
	
	private static void inserisciNumero (int [] arr) {
		int numero, posizione;
		boolean end= true;
		do {
			System.out.println("Quale numero vuoi inserire?");
			numero = Integer.parseInt(sc.nextLine());
			if (numero != 0) {
				System.out.println("In che posizione?");
				posizione = Integer.parseInt(sc.nextLine());
				arr[posizione] = numero;
				stampaArray(arr);
			} else {
				end=false;
			};			
		}while (end);
	}
	
	private static void stampaArray (int [] arr) {
		for (int i=0; i<arr.length;i++) {
			System.out.println(i);
		}
	}
	
	private static int[] arrayNInteri() {
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			int num = (int) (Math.random() * 10);
			arr[i] = num;		
			}
		return arr;
	}
}
