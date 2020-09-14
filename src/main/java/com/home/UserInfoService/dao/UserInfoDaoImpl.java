package com.home.UserInfoService.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.home.UserInfoService.model.User;
import com.home.UserInfoService.service.UserInfoServiceImpl;

@Repository
public class UserInfoDaoImpl implements UserInfoDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoDaoImpl.class);

	@Autowired
	private EntityManager entityManager;

	@Override
	public void saveUser(User user) {

		LOGGER.info("UserInfoDaoImpl.saveUser");

		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.beginTransaction();

		try {

			session.save(user);
			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
			LOGGER.info("Excepton While saving User" + e);
		}
	}

	@Override
	public List<User> getAllUsers() {

		LOGGER.info("UserInfoDaoImpl.getAllUsers");
		
		List<User> users = null;
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.beginTransaction();

		try {
			users = session.createCriteria(User.class).list();
			transaction.commit();
		} catch (Exception e) {
			LOGGER.info("Excepton While Fetching User" + e);
		}
		return users;
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
