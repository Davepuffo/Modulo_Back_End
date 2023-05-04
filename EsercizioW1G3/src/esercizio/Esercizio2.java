package esercizio;

public class Esercizio2 {
	public int nIntero;
	
	public Esercizio2 (int nIntero) {
		this.nIntero = nIntero;
	}
	
	public void stampaLettere () {
		switch(nIntero) {
		case 1 : System.out.println("uno"); break;
		case 2 : System.out.println("due"); break;
		case 3 : System.out.println("tre"); break;
		default: System.out.println("Errore!!"); break;
		}
	}
}
