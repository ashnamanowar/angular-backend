package com.lab5_6.controller;

import com.lab5_6.entity.CustomerContactDetails;
import com.lab5_6.service.CustomerContactDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customercontact")
public class CustomerContactDetailsController {

    @Autowired
    private CustomerContactDetailsService detail;

    @GetMapping
    public List<CustomerContactDetails> getAllUser() {
        return detail.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerContactDetails> getUserById(@PathVariable Long id) {
        return detail.getUserById(id)
                .map(customerContactDetails -> new ResponseEntity<>(customerContactDetails, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<CustomerContactDetails> createUser(@RequestBody CustomerContactDetails customerContactDetails) {
    	CustomerContactDetails savedDetail = detail.createUser(customerContactDetails);
        return new ResponseEntity<>(savedDetail, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerContactDetails> updateCustomerContactDetails(@PathVariable Long id,
                                                                   @RequestBody CustomerContactDetails userDetails) {
        try {
        	CustomerContactDetails updatedCustomerContactDetails = detail.updateUser(id, userDetails);
            return new ResponseEntity<>(updatedCustomerContactDetails, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomerContactDetails(@PathVariable Long id) {
        try {
            detail.deleteUser(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}