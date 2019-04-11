package com.dubbo.base.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.dubbo.base.entity.UserInfo;
@Mapper
public interface UserInfoMapper {
    int addUser(UserInfo userInfo);
    UserInfo queryUserInfo(UserInfo userInfo);
}
