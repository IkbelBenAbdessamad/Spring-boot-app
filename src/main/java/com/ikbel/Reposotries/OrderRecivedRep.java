package com.ikbel.Reposotries;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ikbel.Entity.OrderRecived;


/**
 * @author Ikbel benabdessamad
 *
 */
@Repository
@Qualifier(value="OrderRecivedRep")
public interface OrderRecivedRep extends JpaRepository<OrderRecived,String> 
{

	
}
