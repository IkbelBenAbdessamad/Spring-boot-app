package com.ikbel.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ProductCategory",schema="springbootapp")
public class ProductCategory extends KeyEntity {
private String categoryName;
private int percentage;
private boolean BestCategory;
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public int getPercentage() {
	return percentage;
}
public void setPercentage(int percentage) {
	this.percentage = percentage;
}
public boolean isBestCategory() {
	return BestCategory;
}
public void setBestCategory(boolean bestCategory) {
	this.BestCategory = bestCategory;
}

	
	
}
