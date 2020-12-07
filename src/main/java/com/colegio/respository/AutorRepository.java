package com.colegio.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.colegio.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer>{
	@Query("select x from Autor x where x.apaterno like :var_filtro")
	public List<Autor> listaPorApPaterno(@Param("var_filtro") String filtro);
	
}
