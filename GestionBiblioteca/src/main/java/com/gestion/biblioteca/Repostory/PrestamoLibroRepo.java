package com.gestion.biblioteca.Repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.biblioteca.Model.PrestamoLibro;

@Repository
public interface PrestamoLibroRepo extends JpaRepository<PrestamoLibro, Integer>{

}
