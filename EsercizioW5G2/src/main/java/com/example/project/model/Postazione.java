package com.example.project.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "postazioni")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Postazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descrizione;
	private TipoPostazione tipoPostazione;
	private Integer maxPartecipanti;
	
	@ManyToOne
	private Edificio edificio;

	public Postazione(String descrizione, TipoPostazione tipoPostazione, Integer maxPartecipanti, Edificio edificio) {
		super();
		this.descrizione = descrizione;
		this.tipoPostazione = tipoPostazione;
		this.maxPartecipanti = maxPartecipanti;
		this.edificio = edificio;
	}
	
}
