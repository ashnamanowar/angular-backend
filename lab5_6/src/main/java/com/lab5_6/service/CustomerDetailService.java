package com.lab5_6.service;
import com.lab5_6.entity.CustomerDetail;
import java.util.List;
import java.util.Optional;
public interface CustomerDetailService {
 List<CustomerDetail> getAllUsers();
 Optional<CustomerDetail> getUserById(Long id);
 CustomerDetail createUser(CustomerDetail user);
 CustomerDetail updateUser(Long id, CustomerDetail UserDetails);
 void deleteUser(Long id);
}