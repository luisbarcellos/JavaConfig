package com.javaconfig.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javaconfig.config.AppConfig;
import com.javaconfig.impl.HelloWorld;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		
		HelloWorld obj2 = (HelloWorld) context.getBean("helloBean2");
		
		obj.printHelloWorld("Teste com Java Config\n\n");
		obj2.printHelloWorld("Teste com Java Config2");
	}
}
