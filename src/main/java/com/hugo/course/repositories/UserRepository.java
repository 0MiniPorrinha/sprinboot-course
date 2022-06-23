package com.hugo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
