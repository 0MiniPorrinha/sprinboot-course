package com.hugo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugo.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{
    
}
