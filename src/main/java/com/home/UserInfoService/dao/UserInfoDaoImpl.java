package com.home.UserInfoService.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.home.UserInfoService.model.User;

@Repository
public class UserInfoDaoImpl implements UserInfoDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public void saveUser(User user) {

		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.beginTransaction();

		try {

			session.save(user);
			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public List<User> getAllUsers() {
		
		try {
			Session session = entityManager.unwrap(Session.class);
			Transaction transaction = session.beginTransaction();
			
			 
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
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
