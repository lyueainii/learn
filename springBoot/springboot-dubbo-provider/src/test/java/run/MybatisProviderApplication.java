package run;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import java.io.IOException;

import javax.sql.DataSource;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
@MapperScan("com.dubbo.base.mapper")//手动配置
public class MybatisProviderApplication {
	 private static Logger logger = Logger.getLogger(MybatisProviderApplication.class);

	    @Bean
	    @ConfigurationProperties(prefix="spring.datasource")
	    public DataSource dataSource() {
	        return new org.apache.tomcat.jdbc.pool.DataSource();
	    }

	    @Bean
	    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {

	        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
	        sqlSessionFactoryBean.setDataSource(dataSource());

	        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

	        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:com/*/mapper/*.xml"));

	        return sqlSessionFactoryBean.getObject();
	    }

	    @Bean
	    public PlatformTransactionManager transactionManager() {
	        return new DataSourceTransactionManager(dataSource());
	    }

    public static void main(String[] args) {
        SpringApplication.run(MybatisProviderApplication.class, args);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
