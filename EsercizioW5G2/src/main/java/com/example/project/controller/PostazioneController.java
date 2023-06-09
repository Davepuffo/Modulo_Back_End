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

import com.example.project.models.Postazione;
import com.example.project.services.PostazioneService;

@RestController
@RequestMapping("/api/postazioni")
public class PostazioneController {
	
	@Autowired PostazioneService postazioneService;
	
	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(postazioneService.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id){
		return ResponseEntity.ok(postazioneService.getById(id));
	}
	
	@PostMapping
	public ResponseEntity<?> createPostazione (@RequestBody Postazione p){
		return ResponseEntity.ok(postazioneService.create(p));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity <?> updatePostazione (@PathVariable Long id, @RequestBody Postazione p){
		return ResponseEntity.ok(postazioneService.update(id,p));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity <?> deletePostazione (@PathVariable Long id){
		return ResponseEntity.ok(postazioneService.delete(id));
	}
}
