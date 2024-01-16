package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Citizens;
import com.nt.entity.Login;
import com.nt.entity.VaccinationCenter;
import com.nt.repository.ICitizensRepo;
import com.nt.repository.ILoginRepo;
import com.nt.repository.IVaccinationCenterRepo;

@Service
public class LoginServiceImpl implements ILoginService {
	@Autowired
	private ILoginRepo repo1;
	@Autowired
	private IVaccinationCenterRepo repo2;
	@Autowired
	private ICitizensRepo repo3;

	@Override
	public String register1(Login log) {
		repo1.save(log);
		return "Register Successfully";
	}

	@Override
	public List<VaccinationCenter> getAllVaccinationCenters() {
		return repo2.findAll();
	}

	@Override
	public List<Citizens> getAllCitizens() {
		return repo3.findAll();
	}

	@Override
	public String regAddNewCenter(VaccinationCenter vac) {
		repo2.save(vac);
		return null;
	}

	@Override
	public long vacCentersCount() {
		return repo2.count();
		
		
	}

	@Override
	public VaccinationCenter getElementsbyId(int id) {
		return repo2.getById(id);
	}

	@Override
	public Citizens getCitizensById(int id) {
		return repo3.getById(id);
	}

	@Override
	public String updateNewCenter(VaccinationCenter vac) {
		repo2.save(vac);
		return null;
	}

	@Override
	public String deleteBysId(int id) {
		 repo2.deleteById(id);
		 return null;
	}

	@Override
	public long citizensCount() {
		return repo3.count();
	}

	@Override
	public String regAddNewCenter(Citizens ci) {
		repo3.save(ci);
		return null;
	}

	@Override
	public String updateCitizen(Citizens vac) {
		repo3.save(vac);
		return null;
	}

	@Override
	public String deleteByCitizenId(int id) {
		repo3.deleteById(id);
		return null;
	}

	
}
