package com.diogeneskonorath.javaSandbox.NginxHAProxyapiSpringpoc.repository;

import com.diogeneskonorath.javaSandbox.NginxHAProxyapiSpringpoc.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
