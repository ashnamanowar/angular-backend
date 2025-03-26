package com.lab5_6.service;
import com.lab5_6.entity.CustomerName;
import com.lab5_6.repository.CustomerNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class CustomerNameServiceImpl implements CustomerNameService {
 @Autowired
 private CustomerNameRepository userRepository;
 public List<CustomerName> getAllUsers() {
 return userRepository.findAll();
 }
 @Override
 public Optional<CustomerName> getUserById(Long id) {
 return userRepository.findById(id);
 }
 @Override
 public CustomerName createUser(CustomerName customer_name) {
 return userRepository.save(customer_name);
 }
 @Override
 public CustomerName updateUser(Long id, CustomerName userDetails) {
 return userRepository.findById(id)
 .map(customer_name -> {
	 customer_name.setcust_efctv_dt(userDetails.getcust_efctv_dt());
	 customer_name.setcust_email(userDetails.getcust_email());
	 customer_name.setcust_full_name(userDetails.getcust_full_name());
return userRepository.save(customer_name);
 })
 .orElseThrow(() -> new RuntimeException("Item not found with id: " +
id));
 }
 @Override
 public void deleteUser(Long id) {
 userRepository.findById(id).ifPresentOrElse(
 userRepository::delete,
 () -> {
 throw new RuntimeException("Item not found with id: " + id);
 }
 );
 }
}