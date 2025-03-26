package com.lab5_6.controller;

import com.lab5_6.entity.CustomerDetail;
import com.lab5_6.service.CustomerDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customerdetail")
public class CustomerDetailController {

    @Autowired
    private CustomerDetailService detail;

    @GetMapping
    public List<CustomerDetail> getAllUser() {
        return detail.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDetail> getUserById(@PathVariable Long id) {
        return detail.getUserById(id)
                .map(customerDetail -> new ResponseEntity<>(customerDetail, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<CustomerDetail> createUser(@RequestBody CustomerDetail customerDetail) {
        CustomerDetail savedDetail = detail.createUser(customerDetail);
        return new ResponseEntity<>(savedDetail, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerDetail> updateCustomerDetail(@PathVariable Long id,
                                                                   @RequestBody CustomerDetail userDetails) {
        try {
            CustomerDetail updatedCustomerDetail = detail.updateUser(id, userDetails);
            return new ResponseEntity<>(updatedCustomerDetail, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomerIdentification(@PathVariable Long id) {
        try {
            detail.deleteUser(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
