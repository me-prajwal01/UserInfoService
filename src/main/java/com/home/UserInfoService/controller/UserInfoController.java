package com.home.UserInfoService.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.home.UserInfoService.model.User;
import com.home.UserInfoService.service.UserInfoService;
import com.home.UserInfoService.validator.UserValidator;

@RestController
@RequestMapping(value = "/user")
public class UserInfoController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoController.class);
	
	@Autowired
	private UserInfoService userInfoService;

	@Autowired
	private UserValidator userValidator;

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ResponseEntity<User> saveUser(@RequestBody User user, BindingResult result) {

		LOGGER.info("UserInfoController.saveUser()");
		
		userInfoService.saveUser(user);
		return ResponseEntity.ok(user);
	}

	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userInfoService.getAllUsers();
	}

	@RequestMapping(value = "/getUserById", method = RequestMethod.GET)
	public User getUserById(int id) {
		return null;
	}

	@RequestMapping(value = "updateUser", method = RequestMethod.PUT)
	public boolean updateUser(User user) {
		return false;
	}

	@RequestMapping(value = "/deleteUserById", method = RequestMethod.DELETE)
	public boolean deleteUserById(int id) {
		return false;
	}

}
