package com.lab5_6.controller;

import com.lab5_6.entity.CustomerName;
import com.lab5_6.service.CustomerNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customername")
public class CustomerNameController {

    @Autowired
    private CustomerNameService name;

    @GetMapping
    public List<CustomerName> getAllUser() {
        return name.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerName> getUserById(@PathVariable Long id) {
        return Name.getUserById(id)
                .map(customerName -> new ResponseEntity<>(customerName, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<CustomerName> createUser(@RequestBody CustomerName customerName) {
        CustomerName savedDetail = name.createUser(customerName);
        return new ResponseEntity<>(savedDetail, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerName> updateCustomerName(@PathVariable Long id,
                                                                   @RequestBody CustomerName userDetails) {
        try {
            CustomerName updatedCustomerName = name.updateUser(id, userDetails);
            return new ResponseEntity<>(updatedCustomerName, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomerName(@PathVariable Long id) {
        try {
            detail.deleteUser(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
