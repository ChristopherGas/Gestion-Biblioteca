package com.gestion.biblioteca.Model.Bean;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class LibrosBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idLibro;
	
	@Size(max = 30)
	@NotNull
	private String nombreLibro;
	
	@Size(max = 10)
	@NotNull
	private Date fechaLanzamientoLibro;
	
	@Size(max = 30)
	@NotNull
	private String editoralLibro;
	
	@NotNull
	private int noPaginasLibro;
	
	@NotNull
	private int existenciaLibro;

	
	
	public LibrosBean() {
		super();
	}

	public LibrosBean(int idLibro) {
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

	
	@Override
	public String toString() {
		return "LibrosBean [idLibro=" + idLibro + ", nombreLibro=" + nombreLibro + ", fechaLanzamientoLibro="
				+ fechaLanzamientoLibro + ", editoralLibro=" + editoralLibro + ", noPaginasLibro=" + noPaginasLibro
				+ ", existenciaLibro=" + existenciaLibro + "]";
	}
	
}
