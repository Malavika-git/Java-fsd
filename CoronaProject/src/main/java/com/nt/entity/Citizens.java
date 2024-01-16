package com.nt.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Citizens {
	@Id
	@SequenceGenerator(name = "g1",sequenceName = "Cit1",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "g1",strategy = GenerationType.TABLE)
	private int cId;
	private String cName;
	private String cCity;
	private int cNoOfDoses;
	private String vaccinationStatus;
	private String vaccinationCenter;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cid")
	private List<VaccinationCenter> listofvc;
	
	public Citizens() {
		super();
	}

	public Citizens(int cId, String cName, String cCity, int cNoOfDoses, String vaccinationStatus,
			String vaccinationCenter, List<VaccinationCenter> listofvc) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cCity = cCity;
		this.cNoOfDoses = cNoOfDoses;
		this.vaccinationStatus = vaccinationStatus;
		this.vaccinationCenter = vaccinationCenter;
		this.listofvc = listofvc;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcCity() {
		return cCity;
	}

	public void setcCity(String cCity) {
		this.cCity = cCity;
	}

	public int getcNoOfDoses() {
		return cNoOfDoses;
	}

	public void setcNoOfDoses(int cNoOfDoses) {
		this.cNoOfDoses = cNoOfDoses;
	}

	public String getVaccinationStatus() {
		return vaccinationStatus;
	}

	public void setVaccinationStatus(String vaccinationStatus) {
		this.vaccinationStatus = vaccinationStatus;
	}

	public String getVaccinationCenter() {
		return vaccinationCenter;
	}

	public void setVaccinationCenter(String vaccinationCenter) {
		this.vaccinationCenter = vaccinationCenter;
	}

	public List<VaccinationCenter> getListofvc() {
		return listofvc;
	}

	public void setListofvc(List<VaccinationCenter> listofvc) {
		this.listofvc = listofvc;
	}

	@Override
	public String toString() {
		return "Citizens [cId=" + cId + ", cName=" + cName + ", cCity=" + cCity + ", cNoOfDoses=" + cNoOfDoses
				+ ", vaccinationStatus=" + vaccinationStatus + ", vaccinationCenter=" + vaccinationCenter
				+ ", listofvc=" + listofvc + "]";
	}
	
	
	

}
