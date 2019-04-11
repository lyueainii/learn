package com.dubbo.annotation.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.annotation.AnnotationTestService;
import com.dubbo.http.Response;
import com.dubbo.http.ResponseMessage;
import com.dubbo.http.paramreq.gatewayfront.FrontGateWayParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/annotation")
public class TestController {
    /*@Reference(version = "1.0.0")
    private AnnotationTestService testService;*/

    @GetMapping("/hello")
    public ResponseMessage hello() {
    	ResponseMessage  s=new ResponseMessage();
    	s.setResult("asdad");
        return s;
    }

    @GetMapping("/user")
    public ResponseMessage user() {
    	ResponseMessage s=new ResponseMessage();
    //	s.setResult(testService.findUser());
        return s;
    }
    @RequestMapping(value = "/b", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response b(@RequestBody FrontGateWayParam v) {
    	Response s=new Response();
        System.out.println("客户端发送的数据：" + v.toString());
        s.setResult("sucess");
        return s;
    }
   // @ActionAuth(authCn="新增参数")
	@RequestMapping("/addBaseParam")
    @ResponseBody
    public Response UserTest(FrontGateWayParam v,HttpServletRequest request,HttpServletResponse response) {
		Response s=new Response();
        System.out.println("客户端发送的数据：" + v.toString());
        s.setResult("sucess");
        return s;
    }
}
