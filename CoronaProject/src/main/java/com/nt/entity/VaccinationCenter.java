package com.nt.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import java.time.LocalDateTime;

@Entity
public class VaccinationCenter {
	
	@Id
	@SequenceGenerator(name = "g1",sequenceName = "Vac1",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "g1",strategy = GenerationType.TABLE)
	private int id;
	private String name;
	private String city;
	private Integer cid;
	public VaccinationCenter() {
		super();
	}
	public VaccinationCenter(int id, String name, String city, Integer cid) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.cid = cid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "VaccinationCenter [id=" + id + ", name=" + name + ", city=" + city + ", cid=" + cid + "]";
	}
	
	
	

}
