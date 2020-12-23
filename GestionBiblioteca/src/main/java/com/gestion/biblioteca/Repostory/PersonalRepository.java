package com.gestion.biblioteca.Repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.biblioteca.Model.Personal;

public interface PersonalRepository extends JpaRepository<Personal, Integer>{
	
	
}
