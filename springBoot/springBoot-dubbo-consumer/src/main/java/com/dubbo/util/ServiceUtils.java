package com.dubbo.util;

import com.dubbo.http.ResponseMessage;

public class ServiceUtils {
	public static  <T> ResponseMessage getResponse(T t)  
    {  
  
		ResponseMessage response= new ResponseMessage();  
        // 处理自定义异常返回  
      /*  if (t instanceof UserCenterException)  
        {  
            response.setMessage(((UserCenterException)t).getExceptionEnums().getMessage());  
            response.setStatusCode(((UserCenterException)t).getExceptionEnums().getCode());  
            response.setStatus(false);  
        }  */
        // 处理未知异常  
       /* else if (t instanceof Exception)  
        {  
            response.setMessage(DBExceptionEnums.UNKNOWN_ERROR.getMessage());  
            response.setStatusCode(DBExceptionEnums.UNKNOWN_ERROR.getCode());  
            response.setStatus(false);  
        }  */
        // 正常返回  
       // else  
      //  {  
            response.setStatusCode("1000");  
            response.setStatus(true);  
            response.setResult(t);  
      //  }  
  
        return response;  
    }  
}
