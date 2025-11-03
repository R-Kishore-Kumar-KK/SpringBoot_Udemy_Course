package com.kk.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContra implements GamingConsole{

	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Sit Down");
	}
	
	public void right() {
		System.out.println("Shoot");
	}
	
	public void left() {
		System.out.println("Go Backward");
	}
}
