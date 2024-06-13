package com.example.digitalclothingstore.repository;

import com.example.digitalclothingstore.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
