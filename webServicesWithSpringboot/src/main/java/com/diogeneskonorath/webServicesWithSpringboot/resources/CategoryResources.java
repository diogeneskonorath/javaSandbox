package com.diogeneskonorath.webServicesWithSpringboot.resources;

import com.diogeneskonorath.webServicesWithSpringboot.entities.Category;
import com.diogeneskonorath.webServicesWithSpringboot.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> allCategories = service.findAll();
        return ResponseEntity.ok().body(allCategories);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category categoryById = service.findById(id);
        return ResponseEntity.ok().body(categoryById);
    }
}
