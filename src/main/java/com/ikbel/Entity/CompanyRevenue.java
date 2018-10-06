package com.ikbel.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * @author IkbelBenabdessamad on 06/10/2018
 *
 */
@Entity
@Table(name="company_revenue",schema="springbootecomdash")

public class CompanyRevenue extends KeyEntity {
   
	@Column(name="Revenue Month",nullable=false)
	private String month;
	@Column(name="Revenue",nullable=false)
	private double revenue;
	@Column(name="expense",nullable=false)
	private  double expense;
	@Column(name="margin",nullable=false)
	private double margin;
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public double getExpense() {
		return expense;
	}
	public void setExpense(double expense) {
		this.expense = expense;
	}
	public double getMargin() {
		return margin;
	}
	public void setMargin(double margin) {
		this.margin = margin;
	}
	
}
