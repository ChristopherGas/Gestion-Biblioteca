package com.gestion.biblioteca.Model.Bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

public class UsuarioBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "id_usuario")
	private int idUsuario;
	@NotNull
	@Size(max = 50)
	@Column(name = "nombre_usuario")
	private String nombreUsuario;
	@NotNull
	@Size(max = 100)
	@Column(name = "direccion_usuario")
	private String direccionUsuario;
	@NotNull
	@Size(max = 5)
	@Column(name = "sexo_usuario")
	private String sexoUsuario;
	public UsuarioBean() {
	}
	public UsuarioBean(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getDireccionUsuario() {
		return direccionUsuario;
	}
	public void setDireccionUsuario(String direccionUsuario) {
		this.direccionUsuario = direccionUsuario;
	}
	public String getSexoUsuario() {
		return sexoUsuario;
	}
	public void setSexoUsuario(String sexoUsuario) {
		this.sexoUsuario = sexoUsuario;
	}
	
}
