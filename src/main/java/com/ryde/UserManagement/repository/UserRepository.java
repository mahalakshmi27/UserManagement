package com.ryde.UserManagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ryde.UserManagement.model.User;

public interface UserRepository extends MongoRepository<User, String>{
}
