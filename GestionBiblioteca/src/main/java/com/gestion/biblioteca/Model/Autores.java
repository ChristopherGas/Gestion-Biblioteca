package com.gestion.biblioteca.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Autores")
public class Autores {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name = "id_autor")
	private int idAutor;
	
	@Column(name = "nombre_autor", length = 50)
	private String nomAutor;

	public Autores() {
		super();
	}

	public Autores(int idAutor) {
		super();
		this.idAutor = idAutor;
	}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public String getNomAutor() {
		return nomAutor;
	}

	public void setNomAutor(String nomAutor) {
		this.nomAutor = nomAutor;
	}
	
	

}
