package com.gestion.bibliotecaRepostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.bibliotecaModel.Autores;

public interface AutoresRepository extends JpaRepository<Autores, Integer>{
	
	
}
