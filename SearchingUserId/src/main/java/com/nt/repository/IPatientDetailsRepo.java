package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nt.model.PatientDetails;

public interface IPatientDetailsRepo extends JpaRepository<PatientDetails, Integer> {
	
	public List<PatientDetails>  findByPatientId(Integer patientId);

}
