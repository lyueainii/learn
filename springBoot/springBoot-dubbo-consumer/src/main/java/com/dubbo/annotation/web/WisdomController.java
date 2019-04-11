package com.dubbo.annotation.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.http.ResponseMessage;
import com.dubbo.wisdom.WisdomOperService;

@RestController
@RequestMapping("/Wisdom")
public class WisdomController {

	/*@Reference(version = "1.0.0")
    private WisdomOperService wisdomOperService;*/

    @GetMapping("/hello")
    public ResponseMessage hello() {
    	ResponseMessage  s=new ResponseMessage();
    	s.setResult("asdad");
        return s;
    }
}
