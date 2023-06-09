package com.example.project.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.enumeration.TipoPostazione;
import com.example.project.models.Edificio;
import com.example.project.models.Postazione;
import com.example.project.models.Prenotazione;
import com.example.project.models.Utente;

@Repository
public interface PrenotazioneDAORepository extends JpaRepository<Prenotazione, Long> {

	public Prenotazione findByGiornoPrenotazioneAndPostazioneAndUtente(LocalDate giornoPrenotazione, Postazione postazione, Utente utente);

}
