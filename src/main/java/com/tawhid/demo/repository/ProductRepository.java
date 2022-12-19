package com.tawhid.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tawhid.demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findAllByCategory_Id(int id);
	//search by keyword
	// Custom query
	@Query(value = "select * from product p where p.name like %:keyword% or p.description like %:keyword%", nativeQuery = true)
	List<Product> findProductByKeyword(@Param("keyword") String keyword);
}
