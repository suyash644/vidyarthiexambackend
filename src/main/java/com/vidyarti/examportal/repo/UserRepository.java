package com.vidyarti.examportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidyarti.examportal.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByUserName(String user);

}
