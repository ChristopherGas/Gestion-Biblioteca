package com.gestion.biblioteca.Repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.biblioteca.Model.Libros;

@Repository
public interface LibrosRepository extends JpaRepository<Libros, Integer>{

}
