package com.hugo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
