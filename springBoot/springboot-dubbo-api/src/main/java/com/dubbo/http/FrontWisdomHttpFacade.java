package com.dubbo.http;

import com.dubbo.http.paramreq.gatewayfront.FrontGateWayParam;
import com.dubbo.http.paramres.gatewayfront.FrontGateWayResult;

public interface FrontWisdomHttpFacade {
   //对接gateway
    FrontGateWayResult sendToGateWay(FrontGateWayParam frontGateWayParam);
	FrontGateWayResult sendUniTran(FrontGateWayParam frontGateWayParam);
	FrontGateWayResult dateTran(FrontGateWayParam frontGateWayParam);
}
