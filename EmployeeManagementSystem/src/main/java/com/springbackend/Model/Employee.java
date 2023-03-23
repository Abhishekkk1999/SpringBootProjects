package com.springbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "EMPLOYEE_TABLE")
public class Employee {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	
	private String name;
	private String address;
	private String project;
	
	
	//Default Constructor
	public Employee() {
		super();
	}
	
	
	
	public Employee(int id, String name, String address, String project) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.project = project;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", project=" + project + "]";
	}



	
	
	}
	
	
