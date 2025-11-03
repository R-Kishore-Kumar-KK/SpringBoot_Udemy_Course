package com.kk.learn_spring_framework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kk.learn_spring_framework.game.GameRunner;
import com.kk.learn_spring_framework.game.GamingConsole;

@Configuration
@ComponentScan("com.kk.learn_spring_framework.game")
public class GameAppBeans {
	

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameAppBeans.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
	
}
