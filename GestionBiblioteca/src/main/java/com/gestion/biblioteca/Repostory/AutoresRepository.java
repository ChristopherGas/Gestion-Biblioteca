package com.gestion.biblioteca.Repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.biblioteca.Model.Autores;

public interface AutoresRepository extends JpaRepository<Autores, Integer>{
	
	
}
