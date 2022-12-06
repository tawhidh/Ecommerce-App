package com.tawhid.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tawhid.demo.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
