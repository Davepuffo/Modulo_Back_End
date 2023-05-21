package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "utenti")
@NamedQuery(name = "tuttiUtenti", query = "SELECT u FROM Utente u")

public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name="numero_tessera")
	private Integer numeroTessera;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false, name="data_nascita")
	private LocalDate dataNascita;
	
	public Utente() {
		super();
	}

	public Utente(String nome, String cognome, LocalDate dataNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
	}

	public Integer getNumeroTessera() {
		return numeroTessera;
	}

	public void setNumeroTessera(Integer numeroTessera) {
		this.numeroTessera = numeroTessera;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	@Override
	public String toString() {
		return " [numeroTessera=" + numeroTessera + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita="
				+ dataNascita + "]";
	}
	
}
