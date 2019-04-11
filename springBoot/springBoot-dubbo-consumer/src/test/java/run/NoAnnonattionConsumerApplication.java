package run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
/*@ImportResource({"classpath:config/spring-annotation-dubbo.xml"})*/
public class NoAnnonattionConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoAnnonattionConsumerApplication.class, args);
    }
}
