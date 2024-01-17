package com.foodorderdeliverySystem.service;

import com.foodorderdeliverySystem.entity.User;

public interface UserService {

	User login(String email, String password );


	User addUser(User user);

	User updateDb(String email,User user);

	void deleteDb(String email);
}




