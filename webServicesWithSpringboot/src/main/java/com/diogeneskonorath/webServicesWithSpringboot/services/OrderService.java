package com.diogeneskonorath.webServicesWithSpringboot.services;

import com.diogeneskonorath.webServicesWithSpringboot.entities.Order;
import com.diogeneskonorath.webServicesWithSpringboot.entities.User;
import com.diogeneskonorath.webServicesWithSpringboot.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> orderById = repository.findById(id);
        return orderById.get();
    }
}
