package com.lab5_6.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.lab5_6.entity.CustomerContactDetails;
public interface CustomerContactDetailsRepository extends JpaRepository<CustomerContactDetails, Long> {
}