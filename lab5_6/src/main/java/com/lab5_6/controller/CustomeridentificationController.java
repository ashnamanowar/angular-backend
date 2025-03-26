package com.lab5_6.controller;

import com.lab5_6.entity.Customeridentification;
import com.lab5_6.service.CustomeridentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customeridentification")
public class CustomeridentificationController {

    @Autowired
    private CustomeridentificationService identification;

    @GetMapping
    public List<Customeridentification> getAllUser() {
        return identification.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customeridentification> getUserById(@PathVariable Long id) {
        return identificationgetUserById(id)
                .map(customeridentification -> new ResponseEntity<>(customeridentification, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Customeridentification> createUser(@RequestBody Customeridentification customeridentification) {
        Customeridentification savedIdentification = identification.createUser(customeridentification);
        return new ResponseEntity<>(savedIdentification, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customeridentification> updateCustomerIdentification(@PathVariable Long id,
                                                                   @RequestBody Customeridentification userDetails) {
        try {
            Customeridentification updatedCustomeridentification = identification.updateUser(id, userDetails);
            return new ResponseEntity<>(updatedCustomeridentification, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomeiidentification(@PathVariable Long id) {
        try {
            identification.deleteUser(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}