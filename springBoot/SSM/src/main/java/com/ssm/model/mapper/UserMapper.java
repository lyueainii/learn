package com.ssm.model.mapper;

import java.util.List;

import com.ssm.model.entity.User;

/**  
 * @ClassName: UserMapper   
 * @Description: mybites���ݲ�ѯ�ӿ�  
 */  
public interface UserMapper {  
  
    List<User> queryList();  
  
    void save(User user);  
  
    void batchDelete(Integer[] ids);  
  
    void update(User user);  
  
}  