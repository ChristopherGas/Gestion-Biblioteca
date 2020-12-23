package com.gestion.bibliotecaService;

import java.util.List;

import com.gestion.bibliotecaModelBean.AutoresBean;

public interface AutoresService {
	
	public Integer saveAutores(AutoresBean autoresBean);
	
	public AutoresBean getAutor(Integer idAutor);
	
	public List<AutoresBean> getAutores();
	
	public Boolean updateAutores(AutoresBean autoresBean);
	
	public Boolean deleteAutores(Integer idAutores);
}
