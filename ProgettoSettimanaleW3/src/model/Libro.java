package model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Libro extends Elemento {
	
	@Column(nullable = false)
	private String autore;
	@Column(nullable = false)
	private String genere;
	
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", genere=" + genere + "]";
	}

	
	
}
