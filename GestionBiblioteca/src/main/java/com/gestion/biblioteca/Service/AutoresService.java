package com.gestion.biblioteca.Service;

import java.util.List;

import com.gestion.biblioteca.Model.Bean.AutoresBean;

public interface AutoresService {
	
	public Integer saveAutores(AutoresBean autoresBean);
	
	public AutoresBean getAutor(Integer idAutor);
	
	public List<AutoresBean> getAutores();
	
	public Boolean updateAutores(AutoresBean autoresBean);
	
	public Boolean deleteAutores(Integer idAutores);
}
