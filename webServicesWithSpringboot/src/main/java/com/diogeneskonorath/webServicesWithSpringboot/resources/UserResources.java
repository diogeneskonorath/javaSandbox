package com.diogeneskonorath.webServicesWithSpringboot.resources;

import com.diogeneskonorath.webServicesWithSpringboot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User userTest = new User(1L, "diogenes", "diogenesks@gmail.com", "984125673", "13245");
        return ResponseEntity.ok().body(userTest);
    }
}
