package com.example.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.models.Prenotazione;
import com.example.project.repository.PrenotazioneDAORepository;

import jakarta.persistence.EntityExistsException;

@Service
public class PrenotazioneService {

	@Autowired PrenotazioneDAORepository repo;
	
	public List<Prenotazione> getAll() {
		return repo.findAll();
	}
	
	public Prenotazione getById(Long id) {
		if (!repo.existsById(id)) {
			throw new EntityExistsException("Prenotazione non esistente!!");
		}
		return repo.findById(id).get();
	}
	
	public Prenotazione create(Prenotazione p) {
		if(repo.findByGiornoPrenotazioneAndPostazioneAndUtente(p.getGiornoPrenotazione(), p.getPostazione(), p.getUtente()) != null) {
			throw new EntityExistsException("Postazione già esistente!!");
		}
		return repo.save(p);
	}
	
	public Prenotazione update(Long id, Prenotazione p) {
		if (!repo.existsById(id)) {
			throw new EntityExistsException("Prenotazione non esistente!!");
		}
		return repo.save(p);

	}
	
	public String delete(Long id) {
		if (!repo.existsById(id)) {
			throw new EntityExistsException("Prenotazione non esistente!!");
		}
		repo.deleteById(id);
		return "Prenotazione cancellata!!";
	}
	
}
