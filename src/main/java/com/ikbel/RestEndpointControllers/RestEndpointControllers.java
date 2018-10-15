package com.ikbel.RestEndpointControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ikbel.Entity.EmployeInformation;
import com.ikbel.Services.DashboardServices;

/**
 * @author Ikbel benabdessamad 15/10/2018
 *
 */
@RestController
public class RestEndpointControllers {

	@Autowired
	private DashboardServices dashboardServices;

	@RequestMapping("/employees")
	public List<EmployeInformation> getAllEmp() {
		return dashboardServices.getAllEmployee();

	}
}