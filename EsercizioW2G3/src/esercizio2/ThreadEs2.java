package esercizio2;

import java.util.List;

public class ThreadEs2 extends Thread {
	
	private int [] array;
	private int dovePartire;
	private int quantiNumeri;
	private List <Integer> ListaRisultati;
	
	public ThreadEs2(int[] array, int dovePartire, int quantiNumeri) {
		super();
		this.array = array;
		this.dovePartire = dovePartire;
		this.quantiNumeri = quantiNumeri;
	}

	@Override
	public void run() {
		int sommaRisultati = 0;
		for (int i = dovePartire; i < dovePartire + quantiNumeri; i++) {
			sommaRisultati += array[i];
		}
		System.out.println(sommaRisultati);
	}
}
