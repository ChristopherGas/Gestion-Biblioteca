package com.gestion.bibliotecaService;

import java.util.List;

import com.gestion.bibliotecaModelBean.PersonalBean;

public interface PersonalService {
	
	public Integer savePersonal(PersonalBean personalBean);
	
	public PersonalBean getPersonal(Integer idPersonal);
	
	public List<PersonalBean> getPersonal();
	
	public Boolean updatePersonal(PersonalBean personalBean);
	
	public Boolean deletePersonal(Integer idPersonal);

}
