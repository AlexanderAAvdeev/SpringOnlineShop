package com.example.springonlineshop.repositories;

import com.example.springonlineshop.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    com.example.springonlineshop.models.Category findByName (String name);
}
