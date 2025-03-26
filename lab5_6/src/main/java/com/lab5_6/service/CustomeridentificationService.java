package com.lab5_6.service;
import com.lab5_6.entity.Customeridentification;
import java.util.List;
import java.util.Optional;
public interface CustomeridentificationService {
 List<Customeridentification> getAllUsers();
 Optional<Customeridentification> getUserById(Long id);
 Customeridentification createUser(Customeridentification user);
 Customeridentification updateUser(Long id, Customeridentification UserDetails);
 void deleteUser(Long id);
}