package com.kk.learn_spring_framework.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class HelloWorldConfig {

	public record Person (String name, int age, Address address) {};
	public record Address(String firstLine, String city) {};

	
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
	@Qualifier("person4MethodParameter")
	public Person person4MethodParameter(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	
	@Bean(name="address1")
	public Address address() {
		return new Address("Semmandalam", "Cuddalore");
	}
	
	@Bean(name="address2")
	@Primary
	public Address address2() {
		return new Address("Manjakuppam", "Cuddalore");
	}
}
