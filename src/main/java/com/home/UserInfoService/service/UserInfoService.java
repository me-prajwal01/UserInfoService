package com.home.UserInfoService.service;

import java.util.List;

import com.home.UserInfoService.model.User;

public interface UserInfoService {

	void saveUser(User user);

	List<User> getAllUsers();

	User getUserById(int id);

	boolean updateUser(User user);

	boolean deleteUserById(int id);

}
