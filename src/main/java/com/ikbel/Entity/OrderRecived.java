package com.ikbel.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Order_Recived",schema="springbootapp")
public class OrderRecived extends KeyEntity{
@Column(name="Order_Recived",nullable=false)
private int  orderReived;
@Column(name="Date_Recived",nullable=false)
private  String dateRecieved;


public int getOrderReived() {
	return orderReived;
}
public void setOrderReived(int orderReived) {
	this.orderReived = orderReived;
}
public String getDateRecieved() {
	return dateRecieved;
}
public void setDateRecieved(String dateRecieved) {
	this.dateRecieved = dateRecieved;
}

}
