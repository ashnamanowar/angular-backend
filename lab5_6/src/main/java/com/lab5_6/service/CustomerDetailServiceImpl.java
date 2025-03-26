package com.lab5_6.service;
import com.lab5_6.entity.CustomerDetail;
import com.lab5_6.repository.CustomerDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class CustomerDetailServiceImpl implements CustomerDetailService {
 @Autowired
 private CustomerDetailRepository userRepository;
 public List<CustomerDetail> getAllUsers() {
 return userRepository.findAll();
 }
 @Override
 public Optional<CustomerDetail> getUserById(Long id) {
 return userRepository.findById(id);
 }
 @Override
 public CustomerDetail createUser(CustomerDetail customer_details) {
 return userRepository.save(customer_details);
 }
 @Override
 public CustomerDetail updateUser(Long id, CustomerDetail userDetails) {
 return userRepository.findById(id)
 .map(customer_details -> {
	 customer_details.setcust_contact_num(userDetails.getcust_contact_num());
	 customer_details.setcust_country(userDetails.getcust_country());
	 customer_details.setcust_dob(userDetails.getcust_dob());
	 customer_details.setcust_efctv_dt(userDetails.getcust_efctv_dt());
	 customer_details.setcust_email(userDetails.getcust_email());
	 customer_details.setcust_full_name(userDetails.getcust_full_name());
	 customer_details.setcust_mobile_num(userDetails.getcust_mobile_num());
	 customer_details.setcust_status(userDetails.getcust_status());
	 customer_details.setcust_type(userDetails.getcust_type());
return userRepository.save(customer_details);
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