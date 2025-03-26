package com.lab5_6.service;
import com.lab5_6.entity.CustomerProofofId;
import com.lab5_6.repository.CustomerProofofIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class CustomerProofofIdServiceImpl implements CustomerProofofIdService {
 @Autowired
 private CustomerProofofIdRepository userRepository;
 public List<CustomerProofofId> getAllUsers() {
 return userRepository.findAll();
 } 
 @Override
 public Optional<CustomerProofofId> getUserById(Long id) {
 return userRepository.findById(id);
 }
 @Override
 public CustomerProofofId createUser(CustomerProofofId customer_proofof_id) {
 return userRepository.save(customer_proofof_id);
 }
 @Override
 public CustomerProofofId updateUser(Long id, CustomerProofofId userDetails) {
 return userRepository.findById(id)
 .map(customer_proofof_id -> {
	 customer_proofof_id.setproof_type_id(userDetails.getproof_type_id());
	 customer_proofof_id.setproof_value(userDetails.getproof_value());
	 customer_proofof_id.setcust_efctv_dt(userDetails.getcust_efctv_dt());
	 customer_proofof_id.setend_date(userDetails.getend_date());
return userRepository.save(customer_proofof_id);
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
