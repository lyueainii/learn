package com.ssm.service;

import com.ssm.model.entity.User;
import com.ssm.util.Response;

public interface UserService {
	
    public Response queryList();
  
    public Response save(User user);
  
    public Response batchDelete(Integer[] ids);
  
    public Response update(User user);
}
