package com.ikbel.Reposotries;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ikbel.Entity.EmployeInformation;

/**
 * @author Ikbel benabdessamad
 *
 */
@Repository
@Qualifier(value="EmployInformationRep")
public interface EmployInformationRep extends JpaRepository<EmployeInformation,String> 
{

	
}
