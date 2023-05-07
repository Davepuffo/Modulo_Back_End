package Esercizio;

public abstract class ElementoRiproducibile extends ElementoMultimediale {
	protected String durata;
	protected String volume;
	
	public ElementoRiproducibile(String titolo, String durata, String volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
	}
	
	@Override
	public String toString() {
		return super.toString() + "durata= " + durata + " volume: " + volume;
	}
	
	
}
