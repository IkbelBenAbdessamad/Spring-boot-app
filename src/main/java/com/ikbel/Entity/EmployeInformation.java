package com.ikbel.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Employ_Informations", schema = "springbootapp")
public class EmployeInformation extends KeyEntity {
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "postion", nullable = false)
	private String postion;
	@Column(name = "Office_Location", nullable = false)
	private String officeLocation;
	@Column(name = "age", nullable = false)
	private int age;

	@Column(name = "Start_Date", nullable = false)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date startDate;
	@Column(name = "Salary", nullable = false)
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
