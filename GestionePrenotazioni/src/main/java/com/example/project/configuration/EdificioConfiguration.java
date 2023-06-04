package com.example.project.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.project.model.Edificio;
import com.github.javafaker.Faker;

@Configuration
public class EdificioConfiguration {

	
	@Bean("CustomEdificioBean")
	@Scope("prototype")
	public Edificio customEdificio() {
		return new Edificio();
	}
	
	@Bean("FakeEdificioBean")
	@Scope("prototype")
	public Edificio fakeEdificio() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		Edificio edificioFake = new Edificio();
		edificioFake.setNome(fake.commerce().department());
		edificioFake.setIndirizzo(fake.address().streetName());
		edificioFake.setCittà(fake.address().city());
		return edificioFake;
	}
}
