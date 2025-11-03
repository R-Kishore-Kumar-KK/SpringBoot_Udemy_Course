package com.kk.learn_spring_framework;

import java.util.Arrays;

import com.kk.learn_spring_framework.config.HelloWorldConfig.Address;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kk.learn_spring_framework.config.HelloWorldConfig;

public class HelloWorldApp {

	public static void main(String[] args) {
		try (//Step1: Launch the Spring Context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class)) {
			//Step3: Retreving beans managed by Spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address1"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3MethodParameter"));
			System.out.println(context.getBean("person4MethodParameter"));
			System.out.println(context.getBean(Address.class));
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Step2: Configure the spring that we want to manage
		//HelloWorldConfig - @Configuration

	}
}
