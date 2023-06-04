package com.example.project.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "prenotazioni")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Prenotazione {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dataPrenotazione;
	
	@ManyToOne
	private Utente utente;
	
	@OneToOne
	private Postazione postazione;

	public Prenotazione(LocalDate dataPrenotazione, Utente utente, Postazione postazione) {
		super();
		this.dataPrenotazione = dataPrenotazione;
		this.utente = utente;
		this.postazione = postazione;
	}
	
}
