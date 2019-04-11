package com.dubbo.http.paramres.gatewayfront;

import com.dubbo.base.ResponseResult;

@SuppressWarnings("serial")
public class FrontGateWayResult extends ResponseResult{
	private String jsonBody;//json鏁版嵁浣�?

	public String getJsonBody() {
		return jsonBody;
	}

	public void setJsonBody(String jsonBody) {
		this.jsonBody = jsonBody;
	}
	
}
