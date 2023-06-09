package com.project.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.backend.models.Utente;
import com.project.backend.service.UtenteService;

@RestController
@RequestMapping("/api/utenti")
public class UtenteController {

	@Autowired UtenteService utenteService;
	
	@GetMapping
	public ResponseEntity<?> getAll (){
		return ResponseEntity.ok(utenteService.getAllUtenti());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById (@PathVariable Long id){
		return ResponseEntity.ok(utenteService.getById(id));
	}
	
	@PostMapping
	public ResponseEntity<?> create (@RequestBody Utente u){
		return ResponseEntity.ok(utenteService.createUtente(u));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update (@PathVariable Long id, @RequestBody Utente u){
		return ResponseEntity.ok(utenteService.updateUtente(id, u));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete (@PathVariable Long id){
		return ResponseEntity.ok(utenteService.deleteUtente(id));
	}
}
