package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.MyUser;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
    JdbcTemplate jdbcTemplate;
	
	
	@Override
	public MyUser authenticateUser(String uname, String pass) {
		
		try {
			System.out.println(uname+"-----"+pass);
			
			 return jdbcTemplate.queryForObject("select * from user where username=? and password=?", new Object[]{uname,pass},BeanPropertyRowMapper.newInstance(MyUser.class));
			
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	
	}

}
