package com.example.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.model.Postazione;
import com.example.project.model.TipoPostazione;
import com.example.project.model.Utente;

@Repository
public interface UtenteDaoRepository extends JpaRepository<Utente, String> {

	@Query("SELECT p FROM Postazione p WHERE p.tipoPostazione = :tipo AND edificio in(SELECT e FROM Edificio e WHERE e.città = :citta)")
	public List<Postazione> ricercaTipoCitta(TipoPostazione tipo, String citta);
	
}
