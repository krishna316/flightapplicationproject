package com.keltontech.flightbokingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keltontech.flightbokingsystem.entities.User;

public interface UserDAO extends JpaRepository<User, Integer> {

}
