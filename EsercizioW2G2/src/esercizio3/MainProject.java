package esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainProject {

	static Map<String, String> m = new HashMap<String, String>();
	
	public static void main(String[] args) {

		
	}
	
	public static void aggiungiNumero(String nome, String numero) {
		m.put(nome, numero);
	}
	
	private static void rimuoviContatto (String nome) {
		m.remove(nome);
	}
	
	private static String ricercaPerTelefono (String telefono) {
		for (String nome : m.keySet()) {
			if(m.get(nome).equals(telefono)) {
				return nome;
			}
		}
		return null;
	}
	
	private static String ricercaPerNome (String nome) {
		return m.get(nome);
	}
	
	private static void stampa () {
		Set<String> key = m.keySet();
		for(String nome : key) {
			System.out.println("nome " + nome + " numero " + m.get(nome) );
		}
}
}

