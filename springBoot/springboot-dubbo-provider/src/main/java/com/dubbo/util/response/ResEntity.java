package com.dubbo.util.response;

public class ResEntity {
    private int rescode;
    private String resmsg;
    private Object data;
    
    public ResEntity(ResMessage resMessage) {
        this.rescode = resMessage.getResCode();
        this.resmsg = resMessage.getResMsg();
    }

    public ResEntity(ResMessage resMessage, Object data) {
    	this(resMessage);
        this.data = data;
    }

	public int getRescode() {
		return rescode;
	}

	public void setRescode(int rescode) {
		this.rescode = rescode;
	}

	public String getResmsg() {
		return resmsg;
	}

	public void setResmsg(String resmsg) {
		this.resmsg = resmsg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
