package com.gestion.bibliotecaModelBean;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PrestamoLibroBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id_prestamo_libro;
	
	@Size(max=10)
	@NotNull
	private Date fecha_prestamo_libro;
	
	@Size(max=10)
	@NotNull
	private Date fecha_retorno_prestamo_libro;

	public PrestamoLibroBean() {
		super();
	}

	public PrestamoLibroBean(Integer id_prestamo_libro, @Size(max = 10) @NotNull Date fecha_prestamo_libro,
			@Size(max = 10) @NotNull Date fecha_retorno_prestamo_libro) {
		super();
		this.id_prestamo_libro = id_prestamo_libro;
		this.fecha_prestamo_libro = fecha_prestamo_libro;
		this.fecha_retorno_prestamo_libro = fecha_retorno_prestamo_libro;
	}

	public Integer getId_prestamo_libro() {
		return id_prestamo_libro;
	}

	public void setId_prestamo_libro(Integer id_prestamo_libro) {
		this.id_prestamo_libro = id_prestamo_libro;
	}

	public Date getFecha_prestamo_libro() {
		return fecha_prestamo_libro;
	}

	public void setFecha_prestamo_libro(Date fecha_prestamo_libro) {
		this.fecha_prestamo_libro = fecha_prestamo_libro;
	}

	public Date getFecha_retorno_prestamo_libro() {
		return fecha_retorno_prestamo_libro;
	}

	public void setFecha_retorno_prestamo_libro(Date fecha_retorno_prestamo_libro) {
		this.fecha_retorno_prestamo_libro = fecha_retorno_prestamo_libro;
	}

	@Override
	public String toString() {
		return "PrestamoLibroBean [id_prestamo_libro=" + id_prestamo_libro + ", fecha_prestamo_libro="
				+ fecha_prestamo_libro + ", fecha_retorno_prestamo_libro=" + fecha_retorno_prestamo_libro + "]";
	}
	
	
}
