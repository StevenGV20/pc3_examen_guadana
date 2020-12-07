package com.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entity.Pais;
import com.colegio.respository.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService{
	@Autowired
	private PaisRepository repository;

	@Override
	public List<Pais> listaPais() {
		return repository.findAll();
	}
}
