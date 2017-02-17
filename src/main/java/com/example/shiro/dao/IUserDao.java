package com.example.shiro.dao;

import com.example.shiro.entity.User;

public interface IUserDao {  
    //方法和userMapper.xml中的保持名称一致.   
    public User findUser(Integer id); 
    
}  