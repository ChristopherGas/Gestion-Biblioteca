package com.gestion.bibliotecaRepostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.bibliotecaModel.Libros;

@Repository
public interface LibrosRepository extends JpaRepository<Libros, Integer>{

}