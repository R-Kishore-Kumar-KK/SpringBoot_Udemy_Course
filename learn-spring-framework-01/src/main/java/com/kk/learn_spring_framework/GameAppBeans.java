package com.kk.learn_spring_framework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kk.learn_spring_framework.config.GamingConfiguration;
import com.kk.learn_spring_framework.game.GameRunner;
import com.kk.learn_spring_framework.game.GamingConsole;

public class GameAppBeans {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
	
}
