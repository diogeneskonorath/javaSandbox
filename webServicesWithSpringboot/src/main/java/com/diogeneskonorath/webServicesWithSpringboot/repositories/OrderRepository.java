package com.diogeneskonorath.webServicesWithSpringboot.repositories;

import com.diogeneskonorath.webServicesWithSpringboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
