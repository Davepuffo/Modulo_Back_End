package esercizio;

public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rettangolo r = new Rettangolo(20,3);
		stampaRettangolo(r);
		Rettangolo s = new Rettangolo(10,3);
		Rettangolo t = new Rettangolo(50,2);
		
		
	}
	
	public static void stampaRettangolo(Rettangolo r) {
		System.out.println("l'area del rettangolo è: " + r.calcolaArea() + ", mentre il perimetro è: " + r.calcolaPerimetro());
	}
	
	public static void stampaDueRettangolo(Rettangolo s, Rettangolo t) {
		stampaRettangolo(s);
		stampaRettangolo(t);
		
	}
	
}
