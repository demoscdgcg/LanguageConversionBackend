package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entit.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
