package com.gestion.biblioteca.Service;

import java.util.List;

import com.gestion.biblioteca.Model.Bean.PersonalBean;

public interface PersonalService {
	
	public Integer savePersonal(PersonalBean personalBean);
	
	public PersonalBean getPersonal(Integer idPersonal);
	
	public List<PersonalBean> getPersonal();
	
	public Boolean updatePersonal(PersonalBean personalBean);
	
	public Boolean deletePersonal(Integer idPersonal);

}
