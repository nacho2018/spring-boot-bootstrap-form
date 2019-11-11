package com.spring.bootstrap.form.app.models;

import java.util.List;

public class Company {

	private String name;
	private String foundationYear;
	private String owner;
	private Long employees;
	private List<String> locations;
	
	public Company(String name, String foundationYear, String owner, Long employees, List<String> locations) {
		this.name = name;
		this.foundationYear = foundationYear;
		this.owner = owner;
		this.employees = employees;
		this.locations = locations;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoundationYear() {
		return foundationYear;
	}
	public void setFoundationYear(String foundationYear) {
		this.foundationYear = foundationYear;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Long getEmployees() {
		return employees;
	}
	public void setEmployees(Long employees) {
		this.employees = employees;
	}
	public List<String> getLocations() {
		return locations;
	}
	public void setLocations(List<String> locations) {
		this.locations = locations;
	}
	
}
