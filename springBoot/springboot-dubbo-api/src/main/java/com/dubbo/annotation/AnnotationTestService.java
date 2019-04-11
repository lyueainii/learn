package com.dubbo.annotation;

import com.dubbo.entity.User;

public interface AnnotationTestService {

    String sayHello(String str);

    User findUser();
}
