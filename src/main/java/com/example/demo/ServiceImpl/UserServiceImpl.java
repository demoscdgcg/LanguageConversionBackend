package com.example.demo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entit.User;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepo repo;

	@Override
	public User createUser(User user) {
	    User save = repo.save(user);
		return save;
	}

	@Override
	public List<User> getAllUser() {
		List<User> findAll = repo.findAll();
				return findAll;
	}

	@Override
	public User getSingleUser(int id) {
		 Optional<User> findById = repo.findById(id);
		 return findById.get();
	}
	
	

}
