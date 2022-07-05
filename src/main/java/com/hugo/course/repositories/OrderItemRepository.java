package com.hugo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
