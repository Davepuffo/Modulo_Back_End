package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "edifici")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Edificio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String indirizzo;
	private String città;
	
	public Edificio(String nome, String indirizzo, String città) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.città = città;
	}
	
	
	
}
