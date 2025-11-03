package com.kk.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{

	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Duck");
	}
	
	public void right() {
		System.out.println("Go Forward");
	}
	
	public void left() {
		System.out.println("Go Backward");
	}
}
