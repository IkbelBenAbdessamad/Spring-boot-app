package com.ikbel.Reposotries;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ikbel.Entity.ProductCategory;
@Repository
@Qualifier(value="ProductCategoryRep")
public interface ProductCategoryRep  extends JpaRepository<ProductCategory, String>{
List<ProductCategory> FindByBestCatgory(boolean BestCatgory);
}
