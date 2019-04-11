package com.ssm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.model.entity.User;
import com.ssm.model.mapper.UserMapper;
import com.ssm.service.UserService;
import com.ssm.util.Response;

public class UserServiceImpl implements UserService{
	@Autowired  
    private UserMapper userMapper;  
      
    public Response queryList() {  
        List<User> list = userMapper.queryList();  
        return new Response(list);  
    }  
  
    public Response save(User user) {  
        user.setUsername("user" + System.currentTimeMillis());  
        user.setPassword("123456");  
        user.setEmail("user" + System.currentTimeMillis() + "@test.com");  
        user.setUseable(1);  
        userMapper.save(user);  
        return new Response();  
    }  
  
    public Response batchDelete(Integer[] ids) {  
        userMapper.batchDelete(ids);  
        return new Response();  
    }  
  
    public Response update(User user) {  
        userMapper.update(user);  
        return new Response();  
    }  

}
