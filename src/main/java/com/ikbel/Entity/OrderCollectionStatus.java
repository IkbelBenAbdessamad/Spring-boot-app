package com.ikbel.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="OrderCollectionStatus",schema="springbootapp")
public class OrderCollectionStatus extends KeyEntity{
	@Column(name="New_Order",nullable=false)
	private int newOrder;
	@Column(name="Revenue",nullable=false)
	private double revenue;
	@Column(name="Shipped",nullable=false)
	private int shipped;
	@Column(name="Returned",nullable=false)
	private int returned;
    
	public int getNewOrder() {
		return newOrder;
	}
	public void setNewOrder(int newOrder) {
		this.newOrder = newOrder;
	}
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public int getShipped() {
		return shipped;
	}
	public void setShipped(int shipped) {
		this.shipped = shipped;
	}
	public int getReturned() {
		return returned;
	}
	public void setReturned(int returned) {
		this.returned = returned;
	}
	

}
