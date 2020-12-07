package com.colegio.service;

import java.util.List;
import java.util.Optional;

import com.colegio.entity.Autor;


public interface AutorService {
	public List<Autor> listaAutor();
	public abstract Autor insertActualizaAutor(Autor obj);
	public abstract void eliminaAutor(int id);
	public abstract Optional<Autor> buscaAutor(int id); 
	public List<Autor> listaPorApPaterno(String filtro) ;
}
