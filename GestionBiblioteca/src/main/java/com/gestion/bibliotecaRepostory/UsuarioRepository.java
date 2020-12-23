package com.gestion.bibliotecaRepostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.bibliotecaModel.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
}
