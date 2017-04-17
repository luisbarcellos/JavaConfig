package com.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.javaconfig.impl.HelloWorld;
import com.javaconfig.impl.HelloWorldImpl;

@Configuration
public class AppConfig2 {
	@Bean(name="helloBean2")
	public HelloWorld helloworld(){
		return new HelloWorldImpl();
	}
}
