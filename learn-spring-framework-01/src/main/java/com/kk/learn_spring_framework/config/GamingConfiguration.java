package com.kk.learn_spring_framework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kk.learn_spring_framework.game.GameRunner;
import com.kk.learn_spring_framework.game.GamingConsole;
import com.kk.learn_spring_framework.game.PacMan;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		PacMan game = new PacMan();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		GameRunner gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
