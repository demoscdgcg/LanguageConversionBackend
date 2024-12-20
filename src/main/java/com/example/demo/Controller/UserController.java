package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entit.User;
import com.example.demo.Service.UserService;

@RequestMapping("/api/v2")
@RestController
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService service;
	//http://localhost:8089/api/v2/create
	
	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user){
		return new ResponseEntity<>(service.createUser(user),HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<User>> getALlUser(){
		return new ResponseEntity<List<User>>(service.getAllUser(),HttpStatus.OK);
	}
	
	@GetMapping("/get/single/{id}")
	public ResponseEntity<User> getSingleUser(@PathVariable int id){
		return new ResponseEntity<User>(service.getSingleUser(id),HttpStatus.OK);
	}
}
