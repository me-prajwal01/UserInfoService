package com.home.UserInfoService.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.UserInfoService.dao.UserInfoDao;
import com.home.UserInfoService.model.User;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoServiceImpl.class);
	
	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public void saveUser(User user) {
		
		LOGGER.info("UserInfoServiceImpl.saveUser");
		userInfoDao.saveUser(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userInfoDao.getAllUsers();
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUserById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
