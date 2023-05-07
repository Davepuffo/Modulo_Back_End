package Esercizio;

public class Video extends ElementoRiproducibile implements Volume, Luminosità {
	
	public String luminosità;
	
	public int volume2;
	public int luminosità2;
	//public static int inNumero = Integer.parseInt(durata);

	public Video(String titolo, String durata, String volume, String luminosità) {
		super(titolo, durata, volume);
		this.luminosità = luminosità;
	}
	
	/*static String arr2 [] = new String [inNumero];
	
	public static void cambiaCaratteri(int inNumero) {
		
		for(int i = 0; i < inNumero; i++) {
			if (arr2[i] == null) {
				arr2[i] = "!";
			}
		}
	}
	*/
	
	public void play() {
		System.out.println(super.toString() + " luminosità: " + luminosità);
	}
	
	
	@Override
	public void alzaVolume(int aumVolume) {
		this.volume2 += volume2;
		
	}
	@Override
	public void abbassaVolume(int dimVolume) {
		this.volume2 -= volume2;
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