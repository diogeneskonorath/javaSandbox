package com.diogeneskonorath.webServicesWithSpringboot.repositories;

import com.diogeneskonorath.webServicesWithSpringboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
