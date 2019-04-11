package com.dubbo.base;




/**
 * 鎺ュ彛璇锋眰鍩虹�?
 *
 */
public abstract class RequestParam extends BaseDTO {
	private static final long serialVersionUID = 5532830730395675041L;
	
	/** 璇锋眰鏂圭郴缁熺紪鍙�? */
	private String requestSid;
	
	/** 璇锋眰鏂归�氫俊娴佹按鍙�?,姣忔璇锋眰鍞�? */
	private String requestSerNo;
	
	private String devNo;//璁惧鍙�?
	private String tranCode;//浜ゆ槗鍚�?
	
	

	/**  
	 * 鑾峰�? 璇锋眰鏂圭郴缁熺紪鍙�?
	 * @return requestSid  璇锋眰鏂圭郴缁熺紪鍙�?
	 */
	public String getRequestSid() {
		return requestSid;
	}

	/**  
	 * 璁剧�? 璇锋眰鏂圭郴缁熺紪鍙�?
	 * @param requestSid 璇锋眰鏂圭郴缁熺紪鍙�?
	 */
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
}
