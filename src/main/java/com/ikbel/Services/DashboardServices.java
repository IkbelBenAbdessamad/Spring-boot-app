package com.ikbel.Services;

import java.util.List;

import com.ikbel.Entity.CompanyRevenue;
import com.ikbel.Entity.EmployeInformation;
import com.ikbel.Entity.OrderCollectionStatus;
import com.ikbel.Entity.OrderRecived;
import com.ikbel.Entity.ProductCategory;

public interface DashboardServices {
	List<CompanyRevenue> getTodayRevenueDash();

	List<OrderRecived> getAllOrderRecived();

	List<EmployeInformation> getAllEmployee();

	List<OrderCollectionStatus> getOrderCollection();

	List<ProductCategory> getBestCategory();

	void addEmploy(EmployeInformation employeInformation);

	EmployeInformation updateEmploy(EmployeInformation employeInformation);

	void deleteEmploye(EmployeInformation employeInformation);
}
