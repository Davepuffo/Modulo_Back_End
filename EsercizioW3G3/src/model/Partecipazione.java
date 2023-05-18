package model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import Utils.Stato;

@Entity
@Table(name = "partecipazioni")
public class Partecipazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Persona persona;
	private Evento evento;
	
	@Enumerated(EnumType.STRING)
	private Stato statoPartecipazione;

	
}
