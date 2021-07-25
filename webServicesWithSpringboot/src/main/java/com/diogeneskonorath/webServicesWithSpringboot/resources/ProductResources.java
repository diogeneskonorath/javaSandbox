package com.diogeneskonorath.webServicesWithSpringboot.resources;

import com.diogeneskonorath.webServicesWithSpringboot.entities.Product;
import com.diogeneskonorath.webServicesWithSpringboot.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResources {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> allProducts = service.findAll();
        return ResponseEntity.ok().body(allProducts);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product productById = service.findById(id);
        return ResponseEntity.ok().body(productById);
    }
}
