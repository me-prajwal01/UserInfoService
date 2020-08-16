package com.home.UserInfoService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.home.UserInfoService.model.User;
import com.home.UserInfoService.service.UserInfoService;

@RestController
@RequestMapping(value = "/user")
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public void saveUser(@RequestBody User user) {
		userInfoService.saveUser(user);
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
