package com.vidyarti.examportal.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vidyarti.examportal.helper.UserFoundException;
import com.vidyarti.examportal.model.Role;
import com.vidyarti.examportal.model.User;
import com.vidyarti.examportal.model.UserRole;
import com.vidyarti.examportal.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	//creating user
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		
		Set<UserRole> roles = new HashSet<>();
		
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		
		Role role = new Role();
		role.setRoleId(45L);
		role.setRoleName("NORMAL");
		
		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		roles.add(userRole);
		userService.saveUser(user, roles);
		return user;
		
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return userService.getUserByUserName(username);
		
	}
	
	@DeleteMapping("/{userId}")
	public void deleteUserById(@PathVariable("userId") Long userId) {
		userService.deleteUserByUserId(userId);
	}
	
	@ExceptionHandler(UserFoundException.class)
    public ResponseEntity<?> exceptionHandler(UserFoundException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

}
