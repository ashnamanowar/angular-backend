package com.lab5_6.service;
import com.lab5_6.entity.CustomerProofofId;
import java.util.List;
import java.util.Optional;
public interface CustomerProofofIdService {
 List<CustomerProofofId> getAllUsers();
 Optional<CustomerProofofId> getUserById(Long id);
 CustomerProofofId createUser(CustomerProofofId user);
 CustomerProofofId updateUser(Long id, CustomerProofofId UserDetails);
 void deleteUser(Long id);
}