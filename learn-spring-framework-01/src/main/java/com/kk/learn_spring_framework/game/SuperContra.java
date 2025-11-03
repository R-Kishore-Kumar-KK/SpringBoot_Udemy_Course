package com.kk.learn_spring_framework.game;

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
