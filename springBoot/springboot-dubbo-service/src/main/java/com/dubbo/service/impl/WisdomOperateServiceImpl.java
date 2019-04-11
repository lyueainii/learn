package com.dubbo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dubbo.base.entity.UserInfo;
import com.dubbo.base.mapper.UserInfoMapper;
import com.dubbo.service.WisdomOperateService;
@Component
public class WisdomOperateServiceImpl implements  WisdomOperateService{
	@Autowired
    private  UserInfoMapper userMapper;  
	public UserInfo queryUserInfo( ) {
		UserInfo user=new UserInfo();
		return userMapper.queryUserInfo(user);
	}
}
