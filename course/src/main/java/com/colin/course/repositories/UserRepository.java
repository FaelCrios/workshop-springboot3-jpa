package com.colin.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colin.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
