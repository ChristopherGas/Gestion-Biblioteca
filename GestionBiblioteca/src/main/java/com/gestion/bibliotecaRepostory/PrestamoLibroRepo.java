package com.gestion.bibliotecaRepostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.bibliotecaModel.PrestamoLibro;

@Repository
public interface PrestamoLibroRepo extends JpaRepository<PrestamoLibro, Integer>{

}
