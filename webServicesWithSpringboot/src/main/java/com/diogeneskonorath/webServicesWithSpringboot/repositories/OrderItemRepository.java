package com.diogeneskonorath.webServicesWithSpringboot.repositories;

import com.diogeneskonorath.webServicesWithSpringboot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
