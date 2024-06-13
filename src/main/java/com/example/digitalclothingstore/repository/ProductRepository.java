package com.example.digitalclothingstore.repository;

import com.example.digitalclothingstore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
