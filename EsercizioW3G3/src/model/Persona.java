package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

import Utils.Sesso;

@Entity
@Table(name = "persone")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(nullable=false)
	private String nome;
	private String cognome;
	private String email;
	private LocalDate dataNascita;
	private Sesso sesso;
	private List<Partecipazione> listaPartecipazioni;
}
