package com.ikbel.Entity;

import java.util.Date;

public class EmployeInformation {
	private String name;
	private String  postion;
	private String officeLocation;
	private  int age;
	private Date startDate;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPostion() {
		return postion;
	}
	public void setPostion(String postion) {
		this.postion = postion;
	}
	public String getOfficeLocation() {
		return officeLocation;
	}
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
