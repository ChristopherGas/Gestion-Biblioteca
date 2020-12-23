package com.gestion.biblioteca.Model.Bean;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AutoresBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idAutor;
	
	@Size(max = 50)
	@NotNull
	private String nomAutor;

	public AutoresBean() {
		super();
	}

	public AutoresBean(int idAutor) {
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
