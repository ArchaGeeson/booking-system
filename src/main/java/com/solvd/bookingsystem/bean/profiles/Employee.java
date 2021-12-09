package com.solvd.bookingsystem.bean.profiles;

import java.util.List;

public class Employee<T extends List> {

	private int jobId;
	private String name;
	private int age;
	private String designation;
	private int salary;

	public Employee() {

	}

	public Employee(String name) {
		
		this.name = name;
		
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void printEmployeeInfo() {

	}

}
