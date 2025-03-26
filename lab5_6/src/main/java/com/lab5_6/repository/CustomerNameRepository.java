package com.lab5_6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lab5_6.entity.CustomerName;
public interface CustomerNameRepository extends JpaRepository<CustomerName, Long> {
}