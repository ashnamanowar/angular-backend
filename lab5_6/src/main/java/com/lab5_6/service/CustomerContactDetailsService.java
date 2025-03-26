package com.lab5_6.service;
import com.lab5_6.entity.CustomerContactDetails;
import java.util.List;
import java.util.Optional;
public interface CustomerContactDetailsService {
 List<CustomerContactDetails> getAllUsers();
 Optional<CustomerContactDetails> getUserById(Long id);
 CustomerContactDetails createUser(CustomerContactDetails user);
 CustomerContactDetails updateUser(Long id, CustomerContactDetails UserDetails);
 void deleteUser(Long id);
}