package com.colin.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.colin.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
