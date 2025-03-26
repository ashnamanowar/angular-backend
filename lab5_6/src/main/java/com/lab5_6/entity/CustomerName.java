package com.lab5_6.entity;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class CustomerName{ 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int cust_num;
 private String cust_full_name;
 private String cust_email;
 private Date cust_efctv_dt;
 // Getters and Setters
 public int cust_num(){
	 return cust_num;
 }
 public void setId(int cust_num) {
	 this.cust_num=cust_num;
 }
 public Date getcust_efctv_dt() {
	 return cust_efctv_dt;
 }
 public void setcust_efctv_dt(Date cust_efctv_dt) {
	 this.cust_efctv_dt=cust_efctv_dt;
 }
 public String getcust_full_name() {
	 return cust_full_name;
 }
 public void setcust_full_name(String cust_full_name) {
	 this.cust_full_name=cust_full_name;
 }
 
 public String getcust_email() {
	 return cust_email;
 }
 public void setcust_email(String cust_email) {
	 this.cust_email=cust_email;
 }
 
 
 
}
