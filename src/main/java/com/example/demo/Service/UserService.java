package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entit.User;

public interface UserService {

	public User createUser(User user);
	
	public List<User> getAllUser();
	
	public User  getSingleUser(int id);
}
