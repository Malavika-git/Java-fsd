package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Citizens;

public interface ICitizensRepo extends JpaRepository<Citizens, Integer> {

}
