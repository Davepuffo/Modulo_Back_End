package com.example.project.configuration;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.project.model.Utente;
import com.github.javafaker.Faker;

@Configuration
public class UtenteConfiguration {

	@Value("${utente.admin.username}") private String adminUsername;
	@Value("${utente.admin.nomeCompleto}") private String adminNomeCompleto;
	@Value("${utente.admin.email}") private String adminEmail;

	@Bean("AdminUtenteBean")
	@Scope("singleton")
	public Utente adminUtente() {
		return new Utente(adminUsername, adminNomeCompleto, adminEmail);
	}
	
	@Bean("CustomUtenteBean")
	@Scope("prototype")
	public Utente customUtente() {
		return new Utente();
	}
	
	@Bean("FakeUtenteBean")
	@Scope("prototype")
	public Utente fakeUtente() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		Utente utenteFake = new Utente();
		utenteFake.setNomeCompleto(fake.name().firstName() + "_" + fake.name().lastName());
		utenteFake.setUsername(utenteFake.getNomeCompleto() + fake.letterify("_????"));
		utenteFake.setEmail(utenteFake.getNomeCompleto() + "@example.com");	
		return utenteFake;
	}
}
