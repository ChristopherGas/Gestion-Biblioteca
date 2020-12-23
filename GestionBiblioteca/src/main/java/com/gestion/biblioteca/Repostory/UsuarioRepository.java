package com.gestion.biblioteca.Repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.biblioteca.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
}
