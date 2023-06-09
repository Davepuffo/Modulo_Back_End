package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.models.Prenotazione;
import com.example.project.services.PrenotazioneService;

@RestController
@RequestMapping("/api/prenotazioni")
public class PrenotazioneController {
	
	@Autowired PrenotazioneService prenotazioneService;
	
	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(prenotazioneService.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id){
		return ResponseEntity.ok(prenotazioneService.getById(id));
	}
	
	@PostMapping
	public ResponseEntity<?> createPrenotazione (@RequestBody Prenotazione p){
		return ResponseEntity.ok(prenotazioneService.create(p));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updatePrenotazione (@PathVariable Long id, @RequestBody Prenotazione p){
		return ResponseEntity.ok(prenotazioneService.update(id, p));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletePrenotazione (@PathVariable Long id){
		return ResponseEntity.ok(prenotazioneService.delete(id));
	}
}
