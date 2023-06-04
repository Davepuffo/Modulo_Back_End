package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.project.model.Postazione;
import com.example.project.model.TipoPostazione;
import com.example.project.model.Utente;
import com.example.project.repository.UtenteDaoRepository;

@Service
public class UtenteService {
	
	@Autowired UtenteDaoRepository udr;
	
	@Autowired @Qualifier("FakeUtenteBean") ObjectProvider<Utente> utenteFakeProvider;
	@Autowired @Qualifier("AdminUtenteBean") ObjectProvider<Utente> utenteAdminProvider;
	@Autowired @Qualifier("CustomUtenteBean") ObjectProvider<Utente> utenteCustomProvider;

	public Utente createFakeUtente() {
		return utenteFakeProvider.getObject();
	}
	
	public Utente createAdminUtente() {
		return utenteAdminProvider.getObject();
	}
	
	public Utente createCustomUtente() {
		return utenteCustomProvider.getObject();
	}
	
	public void insertUtente(Utente u) {
		udr.save(u);
		System.out.println("Utente " + u.getNomeCompleto() + " inserito nel DB!!!");
	}
	
	public void updateUtente(Utente u) {
		udr.save(u);
		System.out.println("User " + u.getNomeCompleto() + " modificato nel DB!!!");
	}
	
	public void deleteUtente(Utente u) {
		udr.delete(u);
		System.out.println("User " + u.getNomeCompleto() + " eliminato nel DB!!!");
	}
	
	public List<Utente> getAll() {
		return udr.findAll();
	}
	
	public List<Postazione> findPostazioneCitta(TipoPostazione tipo, String citta){
		return  udr.ricercaTipoCitta(tipo, citta);
		
	}
}
