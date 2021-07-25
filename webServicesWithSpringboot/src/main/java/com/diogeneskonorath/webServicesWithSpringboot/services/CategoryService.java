package com.diogeneskonorath.webServicesWithSpringboot.services;

import com.diogeneskonorath.webServicesWithSpringboot.entities.Category;
import com.diogeneskonorath.webServicesWithSpringboot.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> categoryById = repository.findById(id);
        return categoryById.get();
    }
}
