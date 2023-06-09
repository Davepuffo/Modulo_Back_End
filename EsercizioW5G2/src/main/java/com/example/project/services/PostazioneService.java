package com.example.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.models.Postazione;
import com.example.project.repository.PostazioneDAORepository;

import jakarta.persistence.EntityExistsException;

@Service
public class PostazioneService {

	@Autowired PostazioneDAORepository repo;
	
	public List<Postazione> getAll() {
		return repo.findAll();
	}
	
	public Postazione getById(Long id) {
		if(!repo.existsById(id)) {
			throw new EntityExistsException("Postazione inesistente!!");
		}
		return repo.findById(id).get();
	}
	
	public Postazione create(Postazione p) {
		if(repo.findByDescrizioneAndEdificio(p.getDescrizione(), p.getEdificio()) != null) {
			throw new EntityExistsException("Postazione già esistente!!");
		}
		return repo.save(p);
	}
	
	public Postazione update(Long id, Postazione p) {
		if(!repo.existsById(id)) {
			throw new EntityExistsException("Postazione inesistente!!");
		}
		return repo.save(p);
	}
	
	public String delete(Long id) {
		if(!repo.existsById(id)) {
			throw new EntityExistsException("Postazione inesistente!!");
		}
		repo.deleteById(id);;
		return "Postazione eliminata!";
	}
	
}
