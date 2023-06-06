package com.example.project.model;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "utenti")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Utente {

	@Id
	private String username;
	private String nomeCompleto;
	@Column(unique = true)
	private String email;
	
	@OneToMany(mappedBy = "utente")
	private List<Prenotazione> listaPrenotazioni = new ArrayList<Prenotazione>();

	public Utente(String username, String nomeCompleto, String email) {
		super();
		this.username = username;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
	}
	
	
}
