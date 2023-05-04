package esercizio;

public class Svolgimento2 {
	public int anno;
	
	public Svolgimento2 (int anno) {
		this.anno = anno;
	}
	
	public void annoBisestile() {
		if ((anno % 4) == 0 || (anno % 100) == 0 && (anno % 400) == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
