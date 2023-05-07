package Esercizio;

public class RegistrazioneAudio extends ElementoRiproducibile implements Volume {
	
	public int volume2;
	
	public RegistrazioneAudio(String titolo, String durata, String volume) {
		super(titolo, durata, volume);
	}

	public void play() {
		System.out.println(super.toString());
	}

	@Override
	public void alzaVolume(int aumVolume) {
		this.volume2 += volume2;
		
	}
	@Override
	public void abbassaVolume(int dimVolume) {
		this.volume2 -= volume2;
	}
	
}
