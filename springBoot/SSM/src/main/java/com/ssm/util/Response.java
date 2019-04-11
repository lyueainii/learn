package com.ssm.util;

/*封装数据返回*/
public class Response {
	private int retcode = 1;  
    private String retmsg = "操作成功";  
    private Object data;  
      
    public Response(int retcode, String retmsg, Object data){  
        this.retcode = retcode;  
        this.retmsg = retmsg;  
        this.data = data;  
    }  
      
    public Response(int retcode, String retmsg){  
        this.retcode = retcode;  
        this.retmsg = retmsg;  
    }  
      
    public Response(Object data){  
        this.retmsg = "交易成功";  
        this.data = data;  
    }  
      
    public Response(int retcode){  
        this.retcode = retcode;  
        this.retmsg = "操作失败";  
    }  
      
    public Response(String retmsg){  
        this.retcode = 0;  
        this.retmsg = retmsg;  
    }  
      
    public Response(){  
          
    }  
  
    public int getRetcode() {  
        return retcode;  
    }  
    public void setRetcode(int retcode) {  
        this.retcode = retcode;  
    }  
    public String getRetmsg() {  
        return retmsg;  
    }  
    public void setRetmsg(String retmsg) {  
        this.retmsg = retmsg;  
    }  
    public Object getData() {  
        return data;  
    }  
    public void setData(Object data) {  
        this.data = data;  
    }  
  
    @Override  
    public String toString() {  
        return "Response [retcode=" + retcode + ", retmsg=" + retmsg + ", data=" + data + "]";  
    }  
}
