package com.example.project.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.model.Postazione;
import com.example.project.model.Prenotazione;
import com.example.project.model.Utente;

@Repository
public interface PrenotazioneDaoRepository extends JpaRepository<Prenotazione, Long> {
	
	public List <Prenotazione> findByPostazioneAndDataPrenotazione (Postazione p, LocalDate data);
	public List <Prenotazione> findByUtenteAndDataPrenotazione (Utente u, LocalDate data);
}
