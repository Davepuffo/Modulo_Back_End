package com.example.project.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.project.model.Postazione;
import com.example.project.model.Prenotazione;
import com.example.project.model.Utente;
import com.example.project.repository.PrenotazioneDaoRepository;


@Service
public class PrenotazioneService {

	@Autowired PrenotazioneDaoRepository pdr;
	@Autowired UtenteService us;
	
	@Autowired @Qualifier("CustomPrenotazioneBean") ObjectProvider<Prenotazione> prenotazioneCustomProvider;

	public Prenotazione createCustomPrenotazione() {
		return prenotazioneCustomProvider.getObject();
	}
	
	public void insertPrenotazione(Prenotazione p) {
		List <Prenotazione> prenotazioniUtente = this.giornoUtente(p.getUtente(), p.getDataPrenotazione());
		List <Prenotazione> prenotazioniPostazione = this.giornoPostazione(p.getPostazione(), p.getDataPrenotazione());
		
		if (prenotazioniUtente.size() == 0) {
			if(prenotazioniPostazione.size() == 0) {
				pdr.save(p);
				p.getUtente().getListaPrenotazioni().add(p);
				us.updateUtente(p.getUtente());
				System.out.println("Prenotazione " + p.getId() + " inserito nel DB!!!");				
			} else {
				System.out.println("Postazione gia occupata per quella data!");			
			} 
		} else {
				System.out.println("Hai già una prenotazione per questa data, inseriscine un'altra");
		}
	}
	
	public void updatePrenotazione(Prenotazione p) {
		pdr.save(p);
		System.out.println("Prenotazione " + p.getId() + " modificato nel DB!!!");
	}
	
	public void deletePrenotazione(Prenotazione p) {
		pdr.delete(p);
		System.out.println("Prenotazione " + p.getId() + " eliminato nel DB!!!");
	}
	
	public List<Prenotazione> getAll() {
		return pdr.findAll();
	}
	
	public List<Prenotazione> giornoUtente(Utente u, LocalDate data) {
		return pdr.findByUtenteAndDataPrenotazione(u, data);
	}
	
	public List<Prenotazione> giornoPostazione(Postazione p , LocalDate data) {
		return pdr.findByPostazioneAndDataPrenotazione(p, data);
	}
}
