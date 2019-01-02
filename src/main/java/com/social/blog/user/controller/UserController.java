package com.social.blog.user.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.social.blog.repository.UserProfileRepository;
import com.social.blog.repository.UserRepository;
import com.social.blog.user.model.User;
import com.social.blog.user.model.UserProfile;



@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserRepository userRepository;

	ObjectMapper mapper = new ObjectMapper();

	@Autowired
	UserProfileRepository userProfileRepository;

	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User user) throws JsonProcessingException {

		System.out.println("user : " + mapper.writeValueAsString(user));

		return userRepository.save(user);
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}
