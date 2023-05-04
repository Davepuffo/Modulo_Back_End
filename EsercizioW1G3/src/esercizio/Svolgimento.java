package esercizio;

public class Svolgimento {
	public String parola;
	
	public Svolgimento (String parola) {
		this.parola = parola;
	}
	
	public void stringaPariDispari () {
		if ((parola.length() % 2)== 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
	}
	}
}
