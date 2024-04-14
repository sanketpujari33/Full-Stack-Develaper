package com.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="employeeinfo")
public class Employee {

	@Id
	/*
	@GeneratedValue(strategy=GenerationType.AUTO,generator="emoid_generator")
	
	@SequenceGenerator(name="emaid_generator", initialValue=1,allocationSize=1)
	*/
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	@Column (name= "emp_name")
	private String ampName;

	private int emSalary;
	public int getEmpId() { 
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getAmpName() {
		return ampName;
	}
	public void setAmpName(String ampName) {
		this.ampName = ampName;
	}
	public int getEmSalary() {
		return emSalary;
	}
	public void setEmSalary(int emSalary) {
		this.emSalary = emSalary;
	}

}
