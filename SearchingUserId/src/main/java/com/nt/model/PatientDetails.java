package com.nt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class PatientDetails {
	
		@Id
		@SequenceGenerator(name="gen1", sequenceName = "patientDetails1",initialValue = 1004,allocationSize = 1)
		@GeneratedValue(generator = "gen1",strategy = GenerationType.TABLE)
	    private Integer patientId;
	    private String firstName;
	    private String lastName;
	    private int age;
	    private String gender;
	    private String address;
	    private String phoneNumber;
		public PatientDetails() {
			super();
		}
		public PatientDetails(Integer patientId, String firstName, String lastName, int age, String gender,
				String address, String phoneNumber) {
			super();
			this.patientId = patientId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.gender = gender;
			this.address = address;
			this.phoneNumber = phoneNumber;
		}
		public Integer getPatientId() {
			return patientId;
		}
		public void setPatientId(Integer patientId) {
			this.patientId = patientId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		@Override
		public String toString() {
			return "PatientDetails [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", age=" + age + ", gender=" + gender + ", address=" + address + ", phoneNumber=" + phoneNumber
					+ "]";
		}
	    

}
