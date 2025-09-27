package com.kk.learn_spring_framework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfig {

	@Bean
	public String name() {
		return "Kishore Kumar R";
	}
	
	@Bean
	public int age() {
		return 13;
	}
	
	@Bean
	public Person person() {
		return new Person("Barath", 28, new Address("Shanmugam Street", "Cuddalore"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3MethodParameter(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	public Address address() {
		return new Address("Semmandalam", "Cuddalore");
	}
}
