package com.junsionzhang.service;

import java.util.List;

import com.junsionzhang.model.User;

/**user service **/
public interface UserService {

	User findById(long id);
	User findByName(String name);
	void saveUser(User user);
	void updateUser(User user);
	void deleteUserById(long id);	
	void deleteAllUsers();
	List<User> findAllUsers();
	boolean isUserExist(User user);
}
