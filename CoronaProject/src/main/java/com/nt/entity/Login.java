package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Login {

	@Id
	@SequenceGenerator(name = "g1",sequenceName = "genn1",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "g1",strategy = GenerationType.TABLE)
	private int id;
	private String name;
	private String email;
	private String pwd;
	public Login() {
		super();
	}
	public Login(int id, String name, String email, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + "]";
	}
	
	
	
}
