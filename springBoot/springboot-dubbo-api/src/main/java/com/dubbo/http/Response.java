package com.dubbo.http;

import java.io.Serializable;

/*封装数据返回*/
public class Response implements Serializable {  
	  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Response() {  
  
    }  
  
    public Response(boolean status, String statusCode, String message, Object result) {  
        this.status = status;  
        this.statusCode = statusCode;  
        this.message = message;  
        this.result = result;  
    }  
  
    private boolean status;  
      
    private String statusCode;  
      
    private String message;  
      
    private Object result;  
  
    public boolean isStatus() {  
        return status;  
    }  
  
    public void setStatus(boolean status) {  
        this.status = status;  
    }  
  
    public String getStatusCode() {  
        return statusCode;  
    }  
  
    public void setStatusCode(String statusCode) {  
        this.statusCode = statusCode;  
    }  
  
    public String getMessage() {  
        return message;  
    }  
  
    public void setMessage(String message) {  
        this.message = message;  
    }  
  
    public Object getResult() {  
        return result;  
    }  
  
    public void setResult(Object result) {  
        this.result = result;  
    }  
}