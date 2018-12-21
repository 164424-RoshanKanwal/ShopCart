package com.project.shopcart.daointerface;


import java.util.List;

import com.project.shopcart.pojo.User;

public interface IUserDAO {

	User get(int userId);
	List<User> getAllUsers();
	boolean add(User user);
	boolean remove(int userId);
	boolean update(String userName, String password);
	
}
