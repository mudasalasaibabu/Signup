package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.UserRegistration;
import com.example.demo.Repository.UserRepository;
@Service
public class UserService {
	@Autowired
	UserRepository userRepo;
	public void save(UserRegistration user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
	}

}
