package com.example.SpringBoot_Application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Students {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private long phno;
	private String city;
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Students(int id, String name, long phno, String city) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.city = city;
	}
	public Students() {
		super();
	}
	
	

}
