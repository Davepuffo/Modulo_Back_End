package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.project.model.Edificio;
import com.example.project.repository.EdificioDaoRepository;

@Service
public class EdificioService {
	
	@Autowired EdificioDaoRepository edr;
	
	@Autowired @Qualifier("FakeEdificioBean") ObjectProvider<Edificio> edificioFakeProvider;
	@Autowired @Qualifier("CustomEdificioBean") ObjectProvider<Edificio> edificioCustomProvider;

	public Edificio createFakeEdificio() {
		return edificioFakeProvider.getObject();
	}
	
	public Edificio createCustomEdificio() {
		return edificioCustomProvider.getObject();
	}
	
	public void insertEdificio(Edificio e) {
		edr.save(e);
		System.out.println("Edificio " + e.getNome() + " inserito nel DB!!!");
	}
	
	public void updateEdificio(Edificio e) {
		edr.save(e);
		System.out.println("Edificio " + e.getNome() + " modificato nel DB!!!");
	}
	
	public void deleteEdificio(Edificio e) {
		edr.delete(e);
		System.out.println("Edificio " + e.getNome() + " eliminato nel DB!!!");
	}
	
	public List<Edificio> getAll() {
		return edr.findAll();
	}

}
