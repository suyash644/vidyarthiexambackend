package com.vidyarti.examportal.service;

import java.util.Set;

import com.vidyarti.examportal.model.User;
import com.vidyarti.examportal.model.UserRole;

public interface UserService {
	
	//creating user
	public User saveUser(User user, Set<UserRole> userRoles) throws Exception;
	
	public User getUserByUserName(String username);
	
	public void deleteUserByUserId(Long userId);

}
