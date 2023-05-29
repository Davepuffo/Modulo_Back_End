package Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import models.Bibite;

@Configuration
public class ConfigurationBibite {

	@Bean
	@Scope("prototype")
	public Bibite bibita(String nome, int valoriNutrizionali, double prezzo  ) {
		return new Bibite (nome, valoriNutrizionali, prezzo);	
	}
}
