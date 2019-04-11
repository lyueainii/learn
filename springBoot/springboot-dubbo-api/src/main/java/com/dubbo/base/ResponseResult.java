package com.dubbo.base;




/**
 * 鎺ュ彛杩斿洖鍊煎�?绫�.
 * 娉�:濡傚皢姝ょ被浣滀负鎺ュ彛杩斿洖鍊�?,鍚庣画鏂板杩斿洖�?�楁鏃�?,椤绘柊鍔犺繑鍥炵被鍨嬪拰鎺ュ�?.
 * @author cgnb_liuxb
 */
public class ResponseResult extends BaseDTO{
	private static final long serialVersionUID = -8456915571279674727L;
	/** 璇锋眰鏂圭郴缁熺紪鍙�? */
	private String requestSid;
	
	/** 璇锋眰鏂归�氫俊娴佹按鍙�?,姣忔璇锋眰鍞�? */
	private String requestSerNo;
	
	private String devNo;//璁惧鍙�?
	
	private String tranCode;//浜ゆ槗鍚�?
	
	private String retCode;//杩斿洖鐮�?
	
	private String retMsg;//閿欒鐮佷俊鎭�

	public String getRequestSid() {
		return requestSid;
	}

	public void setRequestSid(String requestSid) {
		this.requestSid = requestSid;
	}

	public String getRequestSerNo() {
		return requestSerNo;
	}

	public void setRequestSerNo(String requestSerNo) {
		this.requestSerNo = requestSerNo;
	}

	public String getDevNo() {
		return devNo;
	}

	public void setDevNo(String devNo) {
		this.devNo = devNo;
	}

	public String getTranCode() {
		return tranCode;
	}

	public void setTranCode(String tranCode) {
		this.tranCode = tranCode;
	}

	public String getRetCode() {
		return retCode;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	public String getRetMsg() {
		return retMsg;
	}

	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}

}
