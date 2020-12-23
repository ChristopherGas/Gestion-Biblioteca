package com.gestion.bibliotecaService;

import java.util.List;

import com.gestion.bibliotecaModelBean.UsuarioBean;

public interface UsuarioService {
	public int saveUser(UsuarioBean usuarioBean);
	
	public int updateUser(UsuarioBean usuarioBean);
	
	public boolean deleteUser(int idUsuario);
	
	public UsuarioBean getUser(int idUsaurio);
	
	public List<UsuarioBean> getAllUsers();	
}
