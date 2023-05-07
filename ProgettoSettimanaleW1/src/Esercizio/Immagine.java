package Esercizio;

public class Immagine extends ElementoMultimediale implements Luminosità{
	public String luminosità;
	public int luminosità2;
	
	public Immagine(String titolo, String luminosità) {
		super(titolo);
		this.luminosità = luminosità;
	}

	public void show() {
		System.out.print(super.toString() + "luminosità: " + luminosità + " ");
	}
	
	@Override
	public void aumentaLuminosità (int aumLuminosità) {
		 this.luminosità2 += aumLuminosità;
	}

	@Override
	public void diminuisciLuminosità(int dimLuminosità) {
		this.luminosità2 -= dimLuminosità;
	}
	
}
