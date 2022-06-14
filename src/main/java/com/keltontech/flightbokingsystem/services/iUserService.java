package com.keltontech.flightbokingsystem.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.keltontech.flightbokingsystem.entities.User;

public interface iUserService {
	
	public abstract Page<User> getAllUsersPaged(int pageNum);

	public abstract List<User> getAllUser();

	public abstract User getUserById(int uid);

	public abstract User saveUser(User user);

	public abstract void deleteUser(int uid);

}
