package com.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.javaconfig.impl.HelloWorld;
import com.javaconfig.impl.HelloWorldImpl;

@Configuration
@ComponentScan(basePackages="com.javaconfig")
public class AppConfig {
	@Bean(name="helloBean")
	public HelloWorld helloworld(){
		return new HelloWorldImpl();
	}
}
