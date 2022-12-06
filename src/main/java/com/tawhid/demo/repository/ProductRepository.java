package com.tawhid.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tawhid.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findAllByCategory_Id(int id);
}
