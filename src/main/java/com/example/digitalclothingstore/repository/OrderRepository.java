package com.example.digitalclothingstore.repository;

import com.example.digitalclothingstore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
