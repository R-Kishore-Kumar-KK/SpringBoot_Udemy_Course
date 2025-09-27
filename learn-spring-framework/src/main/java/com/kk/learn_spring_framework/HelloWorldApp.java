package com.kk.learn_spring_framework;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kk.learn_spring_framework.config.HelloWorldConfig;

public class HelloWorldApp {

	public static void main(String[] args) {
		//Step1: Launch the Spring Context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		//Step2: Configure the spring that we want to manage
		//HelloWorldConfig - @Configuration
		
		//Step3: Retreving beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3MethodParameter"));
		//System.out.println(context.getBean(Address.class));
	}
}
