package Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import models.Oggettistica;

@Configuration
public class ConfigurationOggettistica {

	@Bean
	@Scope("prototype")
	public Oggettistica oggetto(String nome, double prezzo) {
		return new Oggettistica (nome, prezzo);	
	}
}
