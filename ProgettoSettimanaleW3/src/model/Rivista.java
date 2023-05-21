package model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import utils.Periodicità;

@Entity
@Table(name= "riviste")
public class Rivista extends Elemento {

	@Enumerated(EnumType.STRING)
	private Periodicità tipo;

	public Periodicità getTipo() {
		return tipo;
	}
	
	public Rivista() {
		super();
	}

	public Rivista(String titolo, int anno, int nPagine, Periodicità tipo) {
		super(titolo, anno, nPagine);
		this.tipo = tipo;
	}


	public void setTipo(Periodicità tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Rivista [tipo=" + tipo + super.toString();
	}
		
}
