package com.gestion.biblioteca.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "Libros")
public class Libros {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id_libro")
	private int idLibro;
	
	@Column(name = "nombre_libro",length = 30, nullable = false)
	private String nombreLibro;
	
	@Column(name = "fecha_lanzamiento_libro", length = 10, nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaLanzamientoLibro;
	
	@Column(name = "editoral_libro", length = 30, nullable = false)
	private String editoralLibro;
	
	@Column(name = "no_paginas_libro", nullable = false)
	private int noPaginasLibro;
	
	@Column(name = "existencia_libro", nullable = false)
	private int existenciaLibro;

	public Libros() {
		super();
	}

	public Libros(int idLibro) {
		super();
		this.idLibro = idLibro;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public Date getFechaLanzamientoLibro() {
		return fechaLanzamientoLibro;
	}

	public void setFechaLanzamientoLibro(Date fechaLanzamientoLibro) {
		this.fechaLanzamientoLibro = fechaLanzamientoLibro;
	}

	public String getEditoralLibro() {
		return editoralLibro;
	}

	public void setEditoralLibro(String editoralLibro) {
		this.editoralLibro = editoralLibro;
	}

	public int getNoPaginasLibro() {
		return noPaginasLibro;
	}

	public void setNoPaginasLibro(int noPaginasLibro) {
		this.noPaginasLibro = noPaginasLibro;
	}

	public int getExistenciaLibro() {
		return existenciaLibro;
	}

	public void setExistenciaLibro(int existenciaLibro) {
		this.existenciaLibro = existenciaLibro;
	}
	
}
