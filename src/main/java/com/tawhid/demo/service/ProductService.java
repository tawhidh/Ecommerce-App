package com.tawhid.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tawhid.demo.model.Product;
import com.tawhid.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;

	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	public void addProduct(Product product) {
		productRepository.save(product);
	}

	public void deleteProductById(int id) {
		productRepository.deleteById(id);
	}

	public Optional<Product> getProductById(int id) {
		return productRepository.findById(id);
	}

	public List<Product> getAllProductByCategoryId(int id) {
		return productRepository.findAllByCategory_Id(id);
	}
	//search by keyword
	public List<Product> getProductByKeyword(String keyword) {
		return productRepository.findProductByKeyword(keyword);
	}
}
