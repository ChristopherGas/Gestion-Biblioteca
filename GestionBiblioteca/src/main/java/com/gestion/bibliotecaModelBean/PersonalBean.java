package com.gestion.bibliotecaModelBean;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonalBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idPersonal;
	
	@Size(max =50)
	@NotNull
	private String nomPersonal;
	
	@Size(max = 5)
	@NotNull
	private String sexPersonal;
	
	@Size(max = 20)
	@NotNull
	private String cargoPersonal;

	public PersonalBean() {
		super();
	}

	public PersonalBean(int idPersonal) {
		super();
		this.idPersonal = idPersonal;
	}

	public int getIdPersonal() {
		return idPersonal;
	}

	public void setIdPersonal(int idPersonal) {
		this.idPersonal = idPersonal;
	}

	public String getNomPersonal() {
		return nomPersonal;
	}

	public void setNomPersonal(String nomPersonal) {
		this.nomPersonal = nomPersonal;
	}

	public String getSexPersonal() {
		return sexPersonal;
	}

	public void setSexPersonal(String sexPersonal) {
		this.sexPersonal = sexPersonal;
	}

	public String getCargoPersonal() {
		return cargoPersonal;
	}

	public void setCargoPersonal(String cargoPersonal) {
		this.cargoPersonal = cargoPersonal;
	}
	
}
