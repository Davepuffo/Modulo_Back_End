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
public class Oggettistica {
	 
	private String nome;
	private double prezzo;
	
	public String readOggetti () {
		return nome + " " + prezzo;
	}
	
}
