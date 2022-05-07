package com.UserManagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.UserManagement.model.User;

public interface UserRepository extends MongoRepository<User, String>{
	
}
