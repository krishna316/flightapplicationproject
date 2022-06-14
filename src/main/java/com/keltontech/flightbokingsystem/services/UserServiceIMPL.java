package com.keltontech.flightbokingsystem.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.keltontech.flightbokingsystem.dao.UserDAO;
import com.keltontech.flightbokingsystem.entities.User;

@Service
@Transactional
public class UserServiceIMPL implements iUserService {
	
	@Autowired
	private UserDAO userRepo;

	public UserServiceIMPL(UserDAO userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public Page<User> getAllUsersPaged(int pageNum) {
		// TODO Auto-generated method stub
		return userRepo.findAll(PageRequest.of(pageNum, 5, Sort.by("userName")));

	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User getUserById(int uid) {

		return userRepo.findById(uid).orElse(null);
	}

	// save or update
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	// delete a specific record

	public void deleteUser(int uid) {
		userRepo.deleteById(uid);
	}

}
