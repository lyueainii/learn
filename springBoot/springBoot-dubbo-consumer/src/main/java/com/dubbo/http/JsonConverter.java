package com.dubbo.http;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


/*import com.wangyin.front.adapter.InnerToOuter;
import com.wangyin.front.adapter.OuterToInner;
import com.wangyin.front.config.spring.InTransformConfig;
import com.wangyin.front.config.spring.OutServiceBean;
import com.wangyin.front.message.MessageSpecInf;*/


@Component
public class JsonConverter implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
