package com.project.shopcart.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.project.shopcart.daointerface.IUserDAO;
import com.project.shopcart.pojo.User;

public class UserDAOImpl implements IUserDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public User get(int userId) {
		String sqlQuery = "Select * from UserInfo where userId =?";
		/*jdbcTemplate.query*/
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(User user) {
		String sqlQuery = "insert into UserInfo values(?,?,?,?,?,?)";
		jdbcTemplate.update(sqlQuery, user.getUserId(), user.getUserName(), user.getUserEmail(),user.getPassword(), user.getUserPhone() + user.getUserAddress());
		return false;
	}

	@Override
	public boolean remove(int userId) {
		String sqlQuery = "delete from UserInfo where userId =?";
		jdbcTemplate.update(sqlQuery, userId);
		return false;
	}

	@Override
	public boolean update(String email, String password) {
		String sqlQuery = "Update UserInfo set password =? where email =?";
		jdbcTemplate.update(sqlQuery, password, email);
		return false;
	}

}
