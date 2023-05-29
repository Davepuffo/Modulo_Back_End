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
public class Pizza {
	
	public String nome;
	private String ingredienti;
	private String valoriNutrizionali;
	private double prezzo;
	
	
}
