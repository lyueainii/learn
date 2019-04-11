package com.dubbo.configpropertice.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.configproprttice.ProperticeTestService;
import com.dubbo.http.Response;
import com.dubbo.http.ResponseMessage;
import com.dubbo.http.paramreq.gatewayfront.FrontGateWayParam;

@RestController
@RequestMapping("/propertice")
public class ProperticeContronller {
	    @Reference(version = "1.0.0")
	    private ProperticeTestService testService;

	    @GetMapping("/hello")
	    public ResponseMessage hello() {
	    	ResponseMessage s=new ResponseMessage();
	    	s.setResult("asd");
	        return s;
	    }

	    @GetMapping("/user")
	    public ResponseMessage user() {
	    	/*ResponseMessage s=new ResponseMessage();
	    	s.setResult(testService.findUser());*/
	        return testService.findUser();
	    }
	    @RequestMapping(value = "/b", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	    @ResponseBody
	    public ResponseMessage b(@RequestBody FrontGateWayParam v) {
	    	ResponseMessage s=new ResponseMessage();
	        System.out.println("客户端发送的数据：" + v.toString());
	        s.setResult("sucess");
	        return s;
	    }
}
