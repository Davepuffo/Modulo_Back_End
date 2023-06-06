package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.project.model.Postazione;
import com.example.project.repository.PostazioneDaoRepository;


@Service
public class PostazioneService {
	
	@Autowired PostazioneDaoRepository pdr;
	@Autowired @Qualifier("CustomPostazioneBean") ObjectProvider<Postazione> postazioneCustomProvider;

	public Postazione createCustomPostazione() {
		return postazioneCustomProvider.getObject();
	}
	
	public void insertPostazione(Postazione p) {
		pdr.save(p);
		System.out.println("Postazione " + p.getId() + " inserito nel DB!!!");
	}
	
	public void updatePostazione(Postazione p) {
		pdr.save(p);
		System.out.println("Postazione " + p.getId() + " modificato nel DB!!!");
	}
	
	public void deletePostazione(Postazione p) {
		pdr.delete(p);
		System.out.println("Postazione " + p.getId() + " eliminato nel DB!!!");
	}
	
	public List<Postazione> getAll() {
		return pdr.findAll();
	}
}
