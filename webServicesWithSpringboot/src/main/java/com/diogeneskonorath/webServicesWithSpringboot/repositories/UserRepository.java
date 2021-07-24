package com.diogeneskonorath.webServicesWithSpringboot.repositories;

import com.diogeneskonorath.webServicesWithSpringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
