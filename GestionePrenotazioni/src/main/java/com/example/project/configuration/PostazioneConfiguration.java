package com.example.project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.project.model.Postazione;

@Configuration
public class PostazioneConfiguration {

	@Bean("CustomPostazioneBean")
	@Scope("prototype")
	public Postazione customPostazione() {
		return new Postazione();
	}
	
}
