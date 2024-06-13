package com.example.digitalclothingstore.repository;

import com.example.digitalclothingstore.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
