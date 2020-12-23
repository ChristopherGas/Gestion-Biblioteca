package com.gestion.biblioteca.Service.Imp;

import java.util.List;

import com.gestion.biblioteca.Model.Usuario;
import com.gestion.biblioteca.Model.Bean.UsuarioBean;
import com.gestion.biblioteca.Repostory.UsuarioRepository;
import com.gestion.biblioteca.Service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService{
	
	private UsuarioRepository UsuarioRepo;

	@Override
	public int saveUser(UsuarioBean usuarioBean) {
		Usuario usuario = new Usuario();
		
		usuario.setNombreUsuario(usuarioBean.getNombreUsuario());
		usuario.setDireccionUsuario(usuarioBean.getDireccionUsuario());
		usuario.setSexoUsuario(usuarioBean.getSexoUsuario());
		
		UsuarioRepo.save(usuario);
		return usuario.getIdUsuario();
	}

	@Override
	public int updateUser(UsuarioBean usuarioBean) {
		Usuario usuario = new Usuario();
		usuario = this.UsuarioRepo.findById(usuarioBean.getIdUsuario()).orElseThrow();
		
		return 0;
	}

	@Override
	public boolean deleteUser(int idUsuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UsuarioBean getUser(int idUsaurio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioBean> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
