package com.AnnotaionJDBC;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.AnnotaionJDBC,com.nt.dao")
//@PropertySource("classpath:application.properties")
public class App {
	
	   /* @Value("${driverClassName}")
		private String driverName;
		@Value("${url}")
		private String url;
		@Value("${username}")
		private String user;
		@Value("${password}")
		private String password;*/

	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("system");
		return ds;
		
	}
	
	@Bean
	public JdbcTemplate template(DataSource ds) {
		JdbcTemplate jt=new JdbcTemplate(ds);
		return jt;
	}

}
