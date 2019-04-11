package run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
/*@ImportResource({"classpath:config/spring-annotation-dubbo.xml"})*/
public class NoAnnotationProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoAnnotationProviderApplication.class, args);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //此方法不能注解多个服务
}
