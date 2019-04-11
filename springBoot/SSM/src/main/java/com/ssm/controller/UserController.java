package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssm.model.entity.User;
import com.ssm.service.UserService;
import com.ssm.util.Response;

/**  
 * @ClassName: UserController   
 * @Description: ÓÃ»§Controller  
 */  
@RestController//  @RestController=@ResponseBody +@Controller
public class UserController {  
  
    @Autowired  
    private UserService userService;  
      
    @RequestMapping("/queryList")  
    public Response queryList(){  
        return userService.queryList();  
    }  
  
    @RequestMapping("/addUser")  
    public Response addUser(User user){  
        return userService.save(user);  
    }  
      
    @RequestMapping("/delUser")   
    public Response delUser(Integer[] ids){  
        return userService.batchDelete(ids);  
    }  
      
    @RequestMapping("/updateUser")  
    public Response updateUser(User user){  
        return userService.update(user);  
    }  
  
}  
