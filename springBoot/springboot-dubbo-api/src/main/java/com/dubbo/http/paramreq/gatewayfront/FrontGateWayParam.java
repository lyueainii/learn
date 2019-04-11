package com.dubbo.http.paramreq.gatewayfront;

import com.dubbo.base.RequestParam;

public class FrontGateWayParam extends RequestParam{
	private static final long serialVersionUID = 5014434963276263088L;
	private String jsonBody;//json鏁版嵁浣�?
	
	public String getJsonBody() {
		return jsonBody;
	}

	public void setJsonBody(String jsonBody) {
		this.jsonBody = jsonBody;
	}
}
