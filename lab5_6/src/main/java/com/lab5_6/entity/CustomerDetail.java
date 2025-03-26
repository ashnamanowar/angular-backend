package com.lab5_6.entity;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class CustomerDetail{ 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int cust_num;
 private int cust_type;
 private String cust_full_name;
 private Date cust_dob;
 private String cust_status;
 private String cust_contact_num;
 private String cust_mobile_num;
 private String cust_email;
 private String cust_country;
 private Date cust_efctv_dt;
 // Getters and Setters
 public int cust_num(){
	 return cust_num;
 }
 public void setId(int cust_num) {
	 this.cust_num=cust_num;
 }
 public int getcust_type() {
	 return cust_type;
 }
 public void setcust_type(int cust_type) {
	 this.cust_type=cust_type;
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
 public Date getcust_dob() {
	 return cust_dob;
 }
 public void setcust_dob(Date cust_dob) {
	 this.cust_dob=cust_dob;
 }
 
 public String getcust_status() {
	 return cust_status;
 }
 public void setcust_status(String cust_status) {
	 this.cust_status=cust_status;
 }
 
 public String getcust_contact_num() {
	 return cust_contact_num;
 }
 public void setcust_contact_num(String cust_contact_num) {
	 this.cust_contact_num=cust_contact_num;
 }
 
 public String getcust_mobile_num() {
	 return cust_mobile_num;
 }
 public void setcust_mobile_num(String cust_mobile_num) {
	 this.cust_mobile_num=cust_mobile_num;
 }
 
 public String getcust_email() {
	 return cust_email;
 }
 public void setcust_email(String cust_email) {
	 this.cust_email=cust_email;
 }
 
 public String getcust_country() {
	 return cust_country;
 }
 public void setcust_country(String cust_country) {
	 this.cust_country=cust_country;
 }
 
 
 
}
