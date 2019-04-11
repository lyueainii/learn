package com.ssm.model.mapper;

import java.util.List;

import com.ssm.model.entity.User;

/**  
 * @ClassName: UserMapper   
 * @Description: mybites数据查询接口  
 */  
public interface UserMapper {  
  
    List<User> queryList();  
  
    void save(User user);  
  
    void batchDelete(Integer[] ids);  
  
    void update(User user);  
  
}  