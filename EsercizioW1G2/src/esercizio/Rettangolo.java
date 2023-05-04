package esercizio;

public class Rettangolo {
	
	public double lato1;
	public double lato2;
	
	public Rettangolo(double lato1,	double lato2) {
		this.lato1 = lato1;
		this.lato2 = lato2;
	}
	
	public double calcolaArea () {
		return (lato1 * lato2) / 2;
	}
	
	public double calcolaPerimetro () {
		return (lato1 + lato2) * 2;
	}
	
}
