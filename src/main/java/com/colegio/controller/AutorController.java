package com.colegio.controller;

import java.util.List;
import java.util.Optional;

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

import com.colegio.entity.Autor;
import com.colegio.service.AutorService;

@RestController
@RequestMapping("/api/rest/autor")
public class AutorController {
	@Autowired
	private AutorService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Autor>> lista(){
		return ResponseEntity.ok(service.listaAutor());
	}

	@PostMapping
	public ResponseEntity<Autor> inserta(@RequestBody Autor obj){
		return ResponseEntity.ok(service.insertActualizaAutor(obj));
	}
	@PutMapping
	public ResponseEntity<Autor> actualiza(@RequestBody Autor obj){
		return ResponseEntity.ok(service.insertActualizaAutor(obj));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> elimina(@PathVariable int id){
		Optional<Autor> obj=service.buscaAutor(id);
		if(obj.isPresent()) {
			service.eliminaAutor(id);
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.badRequest().build();
		}
	}
	@GetMapping("/porApellido/{filtro}")
	public ResponseEntity<List<Autor>> listaPorApPaterno(@PathVariable String filtro){
		return ResponseEntity.ok(service.listaPorApPaterno(filtro+"%"));
	}
	
	
}
