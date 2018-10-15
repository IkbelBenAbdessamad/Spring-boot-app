package com.ikbel.Reposotries;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ikbel.Entity.OrderCollectionStatus;


/**
 * @author Ikbel benabdessamad
 *
 */
@Repository
@Qualifier(value="OrderCollectionStatusRep")
public interface OrderCollectionStatusRep extends JpaRepository<OrderCollectionStatus,String> 
{

	
}
