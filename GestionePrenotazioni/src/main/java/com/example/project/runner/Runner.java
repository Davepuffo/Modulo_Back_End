package com.example.project.runner;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.project.model.Edificio;
import com.example.project.model.Postazione;
import com.example.project.model.Prenotazione;
import com.example.project.model.TipoPostazione;
import com.example.project.model.Utente;
import com.example.project.service.EdificioService;
import com.example.project.service.PostazioneService;
import com.example.project.service.PrenotazioneService;
import com.example.project.service.UtenteService;

@Component
public class Runner implements ApplicationRunner {

	@Autowired private EdificioService edificioService;
	@Autowired private PostazioneService postazioneService;
	@Autowired private PrenotazioneService prenotazioneService;
	@Autowired private UtenteService utenteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Utente u1 = utenteService.createCustomUtente();
		u1.setUsername("checco");
		u1.setNomeCompleto("Chicco ccciaa");
		u1.setEmail("asdad@gmail.com");

		Utente u2 = utenteService.createCustomUtente();
		u2.setUsername("ofabio");
		u2.setNomeCompleto("fabio faaaaoss");
		u2.setEmail("fpror@gmail.com");
		
		Utente u3 = utenteService.createCustomUtente();
		u3.setUsername("franco");
		u3.setNomeCompleto("frnacoooo ccciaa");
		u3.setEmail("sdjfhoisd@gmail.com");
		utenteService.insertUtente(u1);
		utenteService.insertUtente(u2);
		utenteService.insertUtente(u3);
		
//		Edificio e1 = edificioService.createFakeEdificio();
//		Edificio e2 = edificioService.createFakeEdificio();
//		Edificio e3 = edificioService.createFakeEdificio();
		
		Edificio e1 = edificioService.createCustomEdificio();
		e1.setNome("sldllfòf");
		e1.setCittà("Milano");
		e1.setIndirizzo("via ddaorr");
		Edificio e2 = edificioService.createCustomEdificio();
		e2.setNome("ewoeoel");
		e2.setCittà("Milano");
		e2.setIndirizzo("via eiorpr");
		Edificio e3 = edificioService.createCustomEdificio();
		e3.setNome("ppppppp");
		e3.setCittà("Roma");
		e3.setIndirizzo("via pepepepe");
		edificioService.insertEdificio(e1);
		edificioService.insertEdificio(e2);
		edificioService.insertEdificio(e3);

		Postazione p1 = postazioneService.createCustomPostazione();
		p1.setDescrizione("cena aziendale");
		p1.setMaxPartecipanti(40);
		p1.setTipoPostazione(TipoPostazione.OPENSPACE);
		p1.setEdificio(e1);
		
		Postazione p2 = postazioneService.createCustomPostazione();
		p2.setDescrizione("ping pong");
		p2.setMaxPartecipanti(20);
		p2.setTipoPostazione(TipoPostazione.PRIVATO);
		p2.setEdificio(e2);
		
		Postazione p3 = postazioneService.createCustomPostazione();
		p3.setDescrizione("riunione");
		p3.setMaxPartecipanti(60);
		p3.setTipoPostazione(TipoPostazione.PRIVATO);
		p3.setEdificio(e2);
		
		postazioneService.insertPostazione(p1);
		postazioneService.insertPostazione(p2);
		postazioneService.insertPostazione(p3);
		
		Prenotazione pr1 = prenotazioneService.createCustomPrenotazione();
		pr1.setDataPrenotazione(LocalDate.of(2023, 5, 7));
		pr1.setPostazione(p2);
		pr1.setUtente(u2);
		
		Prenotazione pr2 = prenotazioneService.createCustomPrenotazione();
		pr2.setDataPrenotazione(LocalDate.of(2023, 5, 7));
		pr2.setPostazione(p2);
		pr2.setUtente(u3);
		
		prenotazioneService.insertPrenotazione(pr1);
		prenotazioneService.insertPrenotazione(pr2);

		utenteService.findPostazioneCitta(TipoPostazione.PRIVATO, "Milano").forEach(e -> System.out.println(e));
		
		
	}
	
	
	
}
