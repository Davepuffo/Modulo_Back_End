package Esercizio;

public abstract class ElementoMultimediale {

	protected String titolo;
	
	public ElementoMultimediale(String titolo) {
		this.titolo = titolo;
	}
	
	@Override
	public String toString() {
		return "titolo= " + titolo + " ";
	}

}
