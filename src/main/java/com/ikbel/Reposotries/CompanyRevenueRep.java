package com.ikbel.Reposotries;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ikbel.Entity.CompanyRevenue;

/**
 * @author Ikbel benabdessamad
 *
 */
@Repository
@Qualifier(value="CompanyRevenueRep")
public interface CompanyRevenueRep extends JpaRepository<CompanyRevenue,String> 
{

	
}
