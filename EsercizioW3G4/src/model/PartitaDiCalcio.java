package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Partita_Calcio")
public class PartitaDiCalcio extends Evento {
	
	@Column(nullable = false)
	private String squadraCasa;
	@Column(nullable = false)
	private String squadraOspite;
	@Column(nullable = false)
	private String squadraVincete;
	@Column(nullable = false)
	private Integer golSquadraCasa;
	@Column(nullable = false)
	private Integer golSquadraOspite;
	
	public String getSquadraCasa() {
		return squadraCasa;
	}
	public void setSquadraCasa(String squadraCasa) {
		this.squadraCasa = squadraCasa;
	}
	public String getSquadraOspite() {
		return squadraOspite;
	}
	public void setSquadraOspite(String squadraOspite) {
		this.squadraOspite = squadraOspite;
	}
	public String getSquadraVincete() {
		return squadraVincete;
	}
	public void setSquadraVincete(String squadraVincete) {
		this.squadraVincete = squadraVincete;
	}
	public Integer getGolSquadraCasa() {
		return golSquadraCasa;
	}
	public void setGolSquadraCasa(Integer golSquadraCasa) {
		this.golSquadraCasa = golSquadraCasa;
	}
	public Integer getGolSquadraOspite() {
		return golSquadraOspite;
	}
	public void setGolSquadraOspite(Integer golSquadraOspite) {
		this.golSquadraOspite = golSquadraOspite;
	}
	@Override
	public String toString() {
		return "PartitaDiCalcio [squadraCasa=" + squadraCasa + ", squadraOspite=" + squadraOspite + ", squadraVincete="
				+ squadraVincete + ", golSquadraCasa=" + golSquadraCasa + ", golSquadraOspite=" + golSquadraOspite
				+ "]";
	}
	
}
