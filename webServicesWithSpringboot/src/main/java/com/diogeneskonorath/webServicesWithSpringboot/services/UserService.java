package com.diogeneskonorath.webServicesWithSpringboot.services;

import com.diogeneskonorath.webServicesWithSpringboot.entities.User;
import com.diogeneskonorath.webServicesWithSpringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> userById = repository.findById(id);
        return userById.get();
    }
}
