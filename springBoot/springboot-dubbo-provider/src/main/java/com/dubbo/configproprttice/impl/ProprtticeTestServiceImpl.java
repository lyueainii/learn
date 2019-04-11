package com.dubbo.configproprttice.impl;

import java.text.SimpleDateFormat;
import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.base.entity.UserInfo;
import com.dubbo.base.mapper.UserInfoMapper;
import com.dubbo.configproprttice.ProperticeTestService;
import com.dubbo.http.ResponseMessage;

@Service(version = "1.0.0")
public class ProprtticeTestServiceImpl implements ProperticeTestService{
	/*@Autowired
	private WisdomOperateService wisdomOperateService;*/
	@Autowired
    private  UserInfoMapper userMapper;
	  @Override
	    public String sayHello(String str) {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	        return dateFormat.format(new Date()) + ": " + str;
	    }
      
	    @Override
	    public ResponseMessage findUser() {
	    	ResponseMessage s=new ResponseMessage();
	    	UserInfo user=new UserInfo();
	    	 user.setUserName("a");
	    	s.setResult(userMapper.queryUserInfo(user));
	        return s;
	    }

}
