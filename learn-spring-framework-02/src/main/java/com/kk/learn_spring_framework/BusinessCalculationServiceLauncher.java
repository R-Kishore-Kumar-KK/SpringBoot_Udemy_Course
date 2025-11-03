package com.kk.learn_spring_framework;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kk.learn_spring_framework.calinterfaceImpl.BusinessCalculationService;

@Configuration
@ComponentScan("com.kk.learn_spring_framework.calinterfaceImpl")
public class BusinessCalculationServiceLauncher {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				BusinessCalculationServiceLauncher.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
			
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
