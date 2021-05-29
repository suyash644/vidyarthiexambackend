package com.vidyarti.examportal.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.vidyarti.examportal.helper.UserFoundException;
import com.vidyarti.examportal.model.User;
import com.vidyarti.examportal.model.UserRole;
import com.vidyarti.examportal.repo.RoleRepository;
import com.vidyarti.examportal.repo.UserRepository;
import com.vidyarti.examportal.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepo;

	@Override
	public User saveUser(User user, Set<UserRole> userRoles) throws Exception {
		
		User userData = userRepository.findByUserName(user.getUserName());
		if(userData != null) {
			System.out.println("User Already exists!!");
			throw new UserFoundException();
		}else {
			System.out.println("user Created successfully");
			for(UserRole userRole : userRoles) {
				roleRepo.save(userRole.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			userData = userRepository.save(user);	
		}
		// TODO Auto-generated method stub
		return userData;
		
	}

	@Override
	public User getUserByUserName(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(username);
	}

	@Override
	public void deleteUserByUserId(Long userId) {
		
		userRepository.deleteById(userId);
		// TODO Auto-generated method stub
		
	}

}
