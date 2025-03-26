package com.lab5_6.entity;
import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class CustomerContactDetails{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long customeridentifier;
 private String customercontacttype;
 private String customercontactvalue;
 private Date effectivedt;
 private Date enddate;
 private String addr_value;
 private String address_type_id;
 private Date cust_efctv_dt;
 // Getters and Setters
 public Long customeridentifier(){
	 return customeridentifier;
 }
 public void setId(Long customeridentifier) {
	 this.customeridentifier=customeridentifier;
 }
 public String getcustomercontacttype() {
	 return customercontacttype;
 }
 public void setcustomercontacttype(String customercontacttype) {
	 this.customercontacttype=customercontacttype;
 }
 public String getcustomercontactvalue() {
	 return customercontactvalue;
 }
 public void setcustomercontactvalue(String customercontactvalue) {
	 this.customercontactvalue=customercontactvalue;
 }
 public Date geteffectivedt() {
	 return effectivedt;
 }
 public void seteffectivedt(Date effectivedt) {
	 this.effectivedt=effectivedt;
 }
 
 public String getaddr_value() {
	 return addr_value;
 }
 public void setaddr_value(String addr_value) {
	 this.addr_value=addr_value;
 }
 
 public Date getenddate() {
	 return enddate;
 }
 public void setenddate(Date enddate) {
	 this.enddate=enddate;
 }
 
 public String getaddress_type_id() {
	 return address_type_id;
 }
 public void setaddress_type_id(String address_type_id) {
	 this.address_type_id=address_type_id;
 }
 
 public Date getcust_efctv_dt() {
	 return cust_efctv_dt;
 }
 public void setcust_efctv_dt(Date cust_efctv_dt) {
	 this.cust_efctv_dt=cust_efctv_dt;
 }
 
 }
