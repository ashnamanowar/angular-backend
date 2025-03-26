package com.lab5_6.entity;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Customeridentification{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long cust_id;
 private Long cust_id_type;
 private String cust_id_item;
 private Date cust_efctv_dt;
 // Getters and Setters
 public Long cust_id(){
	 return cust_id;
 }
 public void setId(Long cust_id) {
	 this.cust_id=cust_id;
 }
 public Long getcust_id_type() {
	 return cust_id_type;
 }
 public void setcust_id_type(Long cust_id_type) {
	 this.cust_id_type=cust_id_type;
 }
 public Date getcust_efctv_dt() {
	 return cust_efctv_dt;
 }
 public void setcust_efctv_dt(Date cust_efctv_dt) {
	 this.cust_efctv_dt=cust_efctv_dt;
 }
 public String getcust_id_item() {
	 return cust_id_item;
 }
 public void setcust_id_item(String cust_id_item) {
	 this.cust_id_item=cust_id_item;
 }

 
}