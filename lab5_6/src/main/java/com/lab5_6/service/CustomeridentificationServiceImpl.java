package com.lab5_6.service;
import com.lab5_6.entity.Customeridentification;
import com.lab5_6.repository.CustomeridentificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class CustomeridentificationServiceImpl implements CustomeridentificationService {
 @Autowired
 private CustomeridentificationRepository userRepository;
 public List<Customeridentification> getAllUsers() {
 return userRepository.findAll();
 }
 @Override
 public Optional<Customeridentification> getUserById(Long id) {
 return userRepository.findById(id);
 }
 @Override
 public Customeridentification createUser(Customeridentification customer_identification) {
 return userRepository.save(customer_identification);
 }
 @Override
 public Customeridentification updateUser(Long id, Customeridentification userDetails) {
 return userRepository.findById(id)
 .map(customer_identification -> {
	 customer_identification.setcust_id_type(userDetails.getcust_id_type());
	 customer_identification.setcust_id_item(userDetails.getcust_id_item());
	 customer_identification.setcust_efctv_dt(userDetails.getcust_efctv_dt());
return userRepository.save(customer_identification);
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
