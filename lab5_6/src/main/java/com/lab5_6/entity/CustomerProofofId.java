package com.lab5_6.entity;
import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class CustomerProofofId{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int cust_id;
 private int proof_type_id;
 private String proof_value;
 private Date cust_efctv_dt;
 private Date end_date;
 // Getters and Setters
 public int cust_id(){
	 return cust_id;
 }
 public void setId(int cust_id) {
	 this.cust_id=cust_id;
 }
 public int getproof_type_id() {
	 return proof_type_id;
 }
 public void setproof_type_id(int proof_type_id) {
	 this.proof_type_id=proof_type_id;
 }
 public Date getcust_efctv_dt() {
	 return cust_efctv_dt;
 }
 public void setcust_efctv_dt(Date cust_efctv_dt) {
	 this.cust_efctv_dt=cust_efctv_dt;
 }
 public String getproof_value() {
	 return proof_value;
 }
 public void setproof_value(String proof_value) {
	 this.proof_value=proof_value;
 }
 
 public Date getend_date() {
	 return end_date;
 }
 public void setend_date(Date end_date) {
	 this.end_date=end_date;
 }
 }