package run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:config/spring-annotation-dubbo.xml"})
public class AnnonattionConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnnonattionConsumerApplication.class, args);
    }
}
