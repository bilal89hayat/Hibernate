package com.social.blog.user.controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.social.blog.repository.UserAddressRepository;
import com.social.blog.repository.UserProfileRepository;
import com.social.blog.repository.UserRepository;
import com.social.blog.user.model.User;
import com.social.blog.user.model.UserAddress;
import com.social.blog.user.model.UserProfile;



@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserProfileRepository userProfileRepository;

	@Autowired
	UserAddressRepository userAddressRepository;

	ObjectMapper mapper = new ObjectMapper();

	@PostMapping("/users") // is working
	public User createUser(@Valid @RequestBody User user) throws JsonProcessingException {

		System.out.println("user : " + mapper.writeValueAsString(user));

		return userRepository.save(user);
	}

	@PostMapping("/usersprofile")
	public UserProfile createUser(@Valid @RequestBody UserProfile userp) throws JsonProcessingException {

		System.out.println("user : " + mapper.writeValueAsString(userp));

		return userProfileRepository.save(userp);
	}

	@GetMapping("/users") // is working
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/users/{id}") // not working
	public Optional<User> getUsersById(@PathParam("id") Long id) {
		return userRepository.findById(id);
	}

	@GetMapping("/usersprofile") // is working
	public List<UserProfile> getAllUsersProfile() {
		return userProfileRepository.findAll();
	}

	@GetMapping("/usersprofile/{id}") // not working
	public UserProfile getUsersProfileById(@PathParam("id") Long id) {
		return userProfileRepository.getOne(id);
	}

	@GetMapping("/userAddress")
	public List<UserAddress> getUserAddress() {
		return userAddressRepository.findAll();
	}

}
