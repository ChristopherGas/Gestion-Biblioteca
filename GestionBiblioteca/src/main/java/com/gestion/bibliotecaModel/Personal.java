package com.gestion.bibliotecaModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personal")
public class Personal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_personal")
	private int idPersonal;
	
	@Column(name = "nombre_personal", length = 50, nullable = false)
	private String nomPersonal;
	
	@Column(name = "sexo_personal", length = 5, nullable = false)
	private String sexPersonal;
	
	@Column(name = "cargo_personal", length = 20, nullable = false)
	private String cargoPersonal;

	public Personal() {
		super();
	}

	public Personal(int idPersonal) {
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
