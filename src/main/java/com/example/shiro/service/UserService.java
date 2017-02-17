package com.example.shiro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shiro.dao.IUserDao;
import com.example.shiro.entity.User;

@Service
public class UserService {
	@Autowired
	private IUserDao useDao;
	
	public User getUserById(int id){
		return useDao.findUser(id);
	}
}
