package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Bibite {
	
	private String nome;
	private int valoriNutrizionali;
	private double prezzo;
	
	public String readBibita () {
		return nome + " " + valoriNutrizionali + " " + prezzo;
	}
}