package com.lab5_6.controller;

import com.lab5_6.entity.CustomerProofofId;
import com.lab5_6.service.CustomerProofofIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customerproofofid")
public class CustomerProofofIdController {

    @Autowired
    private CustomerProofofIdService proofofid;

    @GetMapping
    public List<CustomerProofofId> getAllUser() {
        return proofofid.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerProofofId> getUserById(@PathVariable Long id) {
        return proofofid.getUserById(id)
                .map(customerProof -> new ResponseEntity<>(customerProof, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<CustomerProofofId> createUser(@RequestBody CustomerProofofId customerProof) {
        CustomerProofofId savedProofofId = proofofid.createUser(customerProof);
        return new ResponseEntity<>(savedProofofId, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerProofofId> updateCustomerProofofId(@PathVariable Long id,
                                                                   @RequestBody CustomerProofofId userDetails) {
        try {
            CustomerProofofId updatedCustomerProofofId = proofofid.updateUser(id, userDetails);
            return new ResponseEntity<>(updatedCustomerProofofId, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomerProofofId(@PathVariable Long id) {
        try {
            proofofid.deleteUser(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}