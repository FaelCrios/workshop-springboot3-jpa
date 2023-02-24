package com.colin.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colin.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
