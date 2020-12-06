package com.unab.desarrollo.springdata.DAO;

import org.springframework.data.repository.CrudRepository;

import com.unab.desarrollo.springdata.Entidad.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long> {

	
}
