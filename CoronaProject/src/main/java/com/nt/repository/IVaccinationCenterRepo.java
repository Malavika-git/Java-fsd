package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.VaccinationCenter;

public interface IVaccinationCenterRepo extends JpaRepository<VaccinationCenter, Integer> {
	

}
