package com.diogeneskonorath.webServicesWithSpringboot.repositories;

import com.diogeneskonorath.webServicesWithSpringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
