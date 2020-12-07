package com.colegio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entity.Autor;
import com.colegio.respository.AutorRepository;

@Service
public class AutorServiceImpl implements AutorService {
	
	@Autowired
	private AutorRepository repository;
	@Override
	public List<Autor> listaAutor() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	@Override
	public List<Autor> listaPorApPaterno(String filtro) {
		// TODO Auto-generated method stub
		return repository.listaPorApPaterno(filtro);
	}

	@Override
	public Autor insertActualizaAutor(Autor obj) {
		return repository.save(obj);
	}

	@Override
	public void eliminaAutor(int id) {
		repository.deleteById(id);
	}

	@Override
	public Optional<Autor> buscaAutor(int id) {
		return repository.findById(id);
	}
	

}
