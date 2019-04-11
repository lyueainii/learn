package com.ssm.util;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**  
 * @ClassName: DataSourceConfiguration   
 * @Description: ������Դ����  
 */  
@Configuration  
@MapperScan(basePackages = "com.ssm.model.*.mapper")  
public class DataSourceConfiguration {
	    @Bean  
	    @ConfigurationProperties(prefix = "jdbc.ds")  
	    public DataSource readDataSource() {  
	        return new DruidDataSource();  
	    }  
}
