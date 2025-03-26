
package com.lab5_6.service;
import com.lab5_6.entity.CustomerContactDetails;
import com.lab5_6.repository.CustomerContactDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class CustomerContactDetailsServiceImpl implements CustomerContactDetailsService {
 @Autowired
 private CustomerContactDetailsRepository userRepository;
 public List<CustomerContactDetails> getAllUsers() {
 return userRepository.findAll();
 }
 @Override
 public Optional<CustomerContactDetails> getUserById(Long id) {
 return userRepository.findById(id);
 }
 @Override
 public CustomerContactDetails createUser(CustomerContactDetails customer_contact_information) {
 return userRepository.save(customer_contact_information);
 }
 @Override
 public CustomerContactDetails updateUser(Long id, CustomerContactDetails userDetails) {
 return userRepository.findById(id)
 .map(customer_contact_information -> {
	 customer_contact_information.setcustomercontactvalue(userDetails.getcustomercontactvalue());
	 customer_contact_information.seteffectivedt(userDetails.geteffectivedt());
	 customer_contact_information.setenddate(userDetails.getenddate());
	 customer_contact_information.setaddr_value(userDetails.getaddr_value());
	 customer_contact_information.setaddress_type_id(userDetails.getaddress_type_id());
	 customer_contact_information.setcust_efctv_dt(userDetails.getcust_efctv_dt());
	 customer_contact_information.setcustomercontacttype(userDetails.getcustomercontacttype());
return userRepository.save(customer_contact_information);
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