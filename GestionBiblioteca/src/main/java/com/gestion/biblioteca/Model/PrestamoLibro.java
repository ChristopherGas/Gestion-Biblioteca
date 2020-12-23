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
@Table(name = "PrestamoLibro")
public class PrestamoLibro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prestamo_libro")
	private Integer idPrestamo;
	
	@Column(name = "fecha_prestamo_libro", nullable =false, length=10)
	@Temporal(TemporalType.DATE)
	private Date fechaPrestamo;
	
	@Column(name = "fecha_retorno_prestamo_libro", nullable=false, length=10)
	@Temporal(TemporalType.DATE)
	private Date fechaRetornoPrestamoLibro;

	public PrestamoLibro() {
		super();
	}

	public PrestamoLibro(Integer idPrestamo, Date fechaPrestamo, Date fechaRetornoPrestamoLibro) {
		super();
		this.idPrestamo = idPrestamo;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaRetornoPrestamoLibro = fechaRetornoPrestamoLibro;
	}

	public Integer getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(Integer idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaRetornoPrestamoLibro() {
		return fechaRetornoPrestamoLibro;
	}

	public void setFechaRetornoPrestamoLibro(Date fechaRetornoPrestamoLibro) {
		this.fechaRetornoPrestamoLibro = fechaRetornoPrestamoLibro;
	}

	@Override
	public String toString() {
		return "PrestamoLibro [idPrestamo=" + idPrestamo + ", fechaPrestamo=" + fechaPrestamo
				+ ", fechaRetornoPrestamoLibro=" + fechaRetornoPrestamoLibro + "]";
	}

	
}
