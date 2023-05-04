package esercizio2;

public class SIM {
	public String nCell;
	public double credito;
	public Chiamata [] chiamateEffettuate;
	
	public SIM (String nCell) {
		this.nCell = nCell;
		this.credito = 0;
		this.chiamateEffettuate = new Chiamata[5];
	}
	
	public double aumentaCredito (int ricarica) {
		return credito += ricarica;
	}
	
	public void stampaDati () {
		System.out.println(nCell);
		System.out.println(credito);
		for (int i = 0; i < chiamateEffettuate.length; i++) {
			Chiamata c = chiamateEffettuate[i];
			if (c != null) {
				System.out.println(c.numeroChiamato + c.durata);
			}
		}
	}
}
