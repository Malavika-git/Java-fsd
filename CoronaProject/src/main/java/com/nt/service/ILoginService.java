package com.nt.service;

import java.util.List;

import com.nt.entity.Citizens;
import com.nt.entity.Login;
import com.nt.entity.VaccinationCenter;

public interface ILoginService {
	
	List<VaccinationCenter> getAllVaccinationCenters();
	List<Citizens> getAllCitizens();
	
	public String register1(Login log);
	public String regAddNewCenter(VaccinationCenter vac);
	public String regAddNewCenter(Citizens ci);
	public String updateNewCenter(VaccinationCenter vac);
	public String updateCitizen(Citizens vac);
	public long vacCentersCount();
	public long citizensCount();
	public String deleteBysId(int id);
	public String deleteByCitizenId(int id);
	VaccinationCenter getElementsbyId(int id);
	Citizens getCitizensById(int id);
	
	

}
