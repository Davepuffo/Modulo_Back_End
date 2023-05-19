package model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import utils.Periodicità;

@Entity
public class Rivista extends Elemento {

	@Enumerated(EnumType.STRING)
	private Periodicità tipo;

	public Periodicità getTipo() {
		return tipo;
	}

	public void setTipo(Periodicità tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Rivista [tipo=" + tipo + "]";
	}
		
}
