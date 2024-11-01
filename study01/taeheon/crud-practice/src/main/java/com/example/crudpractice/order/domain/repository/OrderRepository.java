package com.example.crudpractice.order.domain.repository;

import com.example.crudpractice.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
