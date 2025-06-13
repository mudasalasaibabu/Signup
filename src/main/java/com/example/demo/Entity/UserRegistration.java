package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserRegistration {
private String name;
private int age;
private String department;
private String email;
@Id
private long phonenumber;
private String address;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(long phonenumber) {
	this.phonenumber = phonenumber;
}
public UserRegistration(String name, int age, String address, String department, String email, long phonenumber) {

	this.name = name;
	this.age = age;
	this.address = address;
	this.department = department;
	this.email = email;
	this.phonenumber = phonenumber;
}
public UserRegistration() {

}

}
