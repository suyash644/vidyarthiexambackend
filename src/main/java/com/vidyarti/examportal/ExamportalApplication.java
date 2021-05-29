package com.vidyarti.examportal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.vidyarti.examportal.model.Role;
import com.vidyarti.examportal.model.User;
import com.vidyarti.examportal.model.UserRole;
import com.vidyarti.examportal.service.UserService;

@SpringBootApplication
public class ExamportalApplication implements CommandLineRunner{
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ExamportalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("working good");
//		User user = new User();
//		user.setFirstName("Suyash");
//		user.setLastName("Srivastava");
//		user.setUserName("suyash644");
//		user.setPassword(bCryptPasswordEncoder.encode("abcd"));
//		user.setEmail("abc@mail.com");
//		user.setProfile("default.png");
//		
//		Role role1 = new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//		
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		
//		
//		Set<UserRole> userRoleSet = new HashSet<UserRole>();
//		userRoleSet.add(userRole);
//		User resultUser = userService.saveUser(user, userRoleSet);
//		System.out.println(resultUser.getUserName());
		
		
	}

}
