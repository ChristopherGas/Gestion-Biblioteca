package com.gestion.bibliotecaRepostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.bibliotecaModel.Personal;

public interface PersonalRepository extends JpaRepository<Personal, Integer>{
	
	
}
