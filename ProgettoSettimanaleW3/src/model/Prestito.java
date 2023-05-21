package model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prestiti")
@NamedQuery(name="tuttiPrestiti", query = "SELECT p FROM Prestito p")
public class Prestito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name= "id_prestito")
	private Integer idPrestito;
	@Column (name= "data_inizio_prestito", nullable = false)
	private LocalDate dataInizioPrestito;
	@Column (name= "data_restituzione_prevista")
	private LocalDate dataRestituzionePrevista;
	@Column (name= "data_restituzione_effettiva")
	private LocalDate dataRestituzioneEffettiva = null;
	
	@ManyToOne (cascade = CascadeType.ALL)
	private Utente utente; 
	
	@OneToOne (cascade = CascadeType.ALL)
	private Elemento elementoPrestato;

	public Prestito() {
		super();
	}

	public Prestito(LocalDate dataInizioPrestito, Utente utente, Elemento elementoPrestato) {
		super();
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataRestituzionePrevista = dataInizioPrestito.plusDays(30);
		this.utente = utente;
		this.elementoPrestato = elementoPrestato;
	}

	public Integer getIdPrestito() {
		return idPrestito;
	}

	public void setIdPrestito(Integer idPrestito) {
		this.idPrestito = idPrestito;
	}

	public LocalDate getDataInizioPrestito() {
		return dataInizioPrestito;
	}

	public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
		this.dataInizioPrestito = dataInizioPrestito;
	}

	public LocalDate getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}

	public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
		this.dataRestituzionePrevista = dataRestituzionePrevista;
	}

	public LocalDate getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}

	public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Elemento getElementoPrestato() {
		return elementoPrestato;
	}

	public void setElementoPrestato(Elemento elementoPrestato) {
		this.elementoPrestato = elementoPrestato;
	}

	@Override
	public String toString() {
		return "Prestito [idPrestito=" + idPrestito + ", dataInizioPrestito=" + dataInizioPrestito + ", dataRestituzionePrevista=" + dataRestituzionePrevista
				+ ",  dataRestituzioneEffettiva = "
				+ dataRestituzioneEffettiva + ", utente=" + utente + ", elementoPrestato = " + elementoPrestato + "]";
	}
	
}
