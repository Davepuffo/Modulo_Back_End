package com.example.project.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.project.model.Prenotazione;
import com.example.project.model.Utente;
import com.github.javafaker.Faker;

@Configuration
public class PrenotazioneConfiguartion {

	
	@Bean("CustomPrenotazioneBean")
	@Scope("prototype")
	public Prenotazione customPrenotazione() {
		return new Prenotazione();
	}
	
}
