package com.lab5_6.service;
import com.lab5_6.entity.CustomerName;
import java.util.List;
import java.util.Optional;
public interface CustomerNameService {
 List<CustomerName> getAllUsers();
 Optional<CustomerName> getUserById(Long id);
 CustomerName createUser(CustomerName user);
 CustomerName updateUser(Long id, CustomerName UserDetails);
 void deleteUser(Long id);
}