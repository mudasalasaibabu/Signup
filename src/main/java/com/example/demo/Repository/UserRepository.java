package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.UserRegistration;

public interface UserRepository extends JpaRepository<UserRegistration,Long>{

}
