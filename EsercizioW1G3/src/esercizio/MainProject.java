package esercizio;

import java.util.Scanner;

public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Svolgimento s = new Svolgimento("ciaoo");
		s.stringaPariDispari();
		
		Svolgimento2 r = new Svolgimento2(800);
		r.annoBisestile();
		
		Esercizio2 e = new Esercizio2(56);
		e.stampaLettere();
		
		Esercizio3 f = new Esercizio3();
		f.trovaQ();
		
		Esercizio4 es = new Esercizio4();
		es.contoRovescia();
	}

}
