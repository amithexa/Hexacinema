package com.hexaware.HexaCinemas.controller;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hexaware.HexaCinemas.model.UserDetails;

public interface UserInterface extends CrudRepository<UserDetails, Integer> {
	@Query(value = "Select * from user_details where useremail = ?1 and userpwd = ?2",nativeQuery = true)
	UserDetails findUser(String useremail,String userpwd);
}
