package com.lab5_6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lab5_6.entity.CustomerDetail;
public interface CustomerDetailRepository extends JpaRepository<CustomerDetail, Long> {
}