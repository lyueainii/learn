package com.dubbo.configproprttice;

import com.dubbo.http.ResponseMessage;

public interface ProperticeTestService {

    String sayHello(String str);

    ResponseMessage findUser();
}
