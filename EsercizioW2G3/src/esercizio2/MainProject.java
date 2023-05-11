package esercizio2;

import esercizio.ThreadClass;

public class MainProject {

	static int arrayNumeri [];
	
	public static void main(String[] args) {

		arrayNumeri = numeriCasuali(3000);
		
		Thread t1 = new ThreadEs2(arrayNumeri, 0, 1000);
		Thread t2 = new ThreadEs2(arrayNumeri, 1000, 2000);
		Thread t3 = new ThreadEs2(arrayNumeri, 2000, 3000);

		t1.start();
		t2.start();
		t3.start();
	}
	
	private static int[] numeriCasuali(int size) {
	int arr[] = new int [size];
		for(int i = 0; i < size; i++) {
		int num = (int) (Math.random() * 3000);
		arr[i] = num;
		}
		return arr;
	}	
	
}
