package com.colin.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colin.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
