package com.ikbel.Services.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ikbel.Entity.CompanyRevenue;
import com.ikbel.Entity.EmployeInformation;
import com.ikbel.Entity.OrderCollectionStatus;
import com.ikbel.Entity.OrderRecived;
import com.ikbel.Entity.ProductCategory;
import com.ikbel.Reposotries.CompanyRevenueRep;
import com.ikbel.Reposotries.EmployInformationRep;
import com.ikbel.Reposotries.OrderCollectionStatusRep;
import com.ikbel.Reposotries.OrderRecivedRep;
import com.ikbel.Reposotries.ProductCategoryRep;
import com.ikbel.Services.DashboardServices;

@Component
public class DashboardServicesImpl implements DashboardServices {

	@Autowired
	private CompanyRevenueRep companyRevenueRep;
	@Autowired
	private EmployInformationRep EmployInformationRep;
	@Autowired
	private OrderCollectionStatusRep OrderCollectionStatusRep;
	@Autowired
	private OrderRecivedRep OrderRecivedRep;
	@Autowired
	private ProductCategoryRep ProductCategoryRep;
	
	
	
	
	@Override
	public List<CompanyRevenue> getTodayRevenueDash() {
		return companyRevenueRep.findAll();
	}
	@Override
	public List<OrderRecived> getAllOrderRecived() {
		return OrderRecivedRep.findAll();
	}
	@Override
	public List<EmployeInformation> getAllEmployee() {
		return EmployInformationRep.findAll();
	}
	@Override
	public List<OrderCollectionStatus> getOrderCollection() {
		return OrderCollectionStatusRep.findAll();
	}
	@Override
	public List<ProductCategory> getBestCategory() {
		return ProductCategoryRep.FindByBestCatgory(true);
	}
	@Override
	public void addEmploy(EmployeInformation employeInformation) {
		EmployInformationRep.save(employeInformation);
	}
	@Override
	public EmployeInformation updateEmploy(EmployeInformation employeInformation) {

		return EmployInformationRep.save(employeInformation);
	}
	@Override
	public void deleteEmploye(EmployeInformation employeInformation) {
		EmployInformationRep.delete(employeInformation);

	}
}
