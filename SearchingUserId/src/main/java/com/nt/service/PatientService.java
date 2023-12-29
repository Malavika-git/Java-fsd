package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.PatientDetails;
import com.nt.repository.IPatientDetailsRepo;

@Service
public class PatientService implements IPatientService {
	@Autowired
	private IPatientDetailsRepo repo;

	@Override
	public List<PatientDetails> getAllDetails() {
		return repo.findAll();
	}

	@Override
	public String addDetail(PatientDetails pat) {
		return repo.save(pat).getPatientId()+" Id is Added to the Patients List";
	}

	@Override
	public PatientDetails getEmployeeById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public String updateEmployee(PatientDetails det) {
		return repo.save(det).getPatientId()+" Id is Updated in the Patients List"; 
	}

	@Override
	public String deleteEmployeeByEno(int id) {
		repo.deleteById(id);
		return id+" Id is Deleted from the Patients list";
	}

	@Override
	public List<PatientDetails> checkId(int id) {
		return repo.findByPatientId(id);
	}

}
