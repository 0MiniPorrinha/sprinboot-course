package com.hugo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
