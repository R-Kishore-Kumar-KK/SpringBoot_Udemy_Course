package com.kk.learn_spring_framework;

import com.kk.learn_spring_framework.game.GameRunner;
import com.kk.learn_spring_framework.game.MarioGame;
import com.kk.learn_spring_framework.game.SuperContra;

public class GameAppBasic {

	public static void main(String[] args) {
		//MarioGame marioGame = new MarioGame();
		SuperContra superContra = new SuperContra();
		GameRunner gameRunner = new GameRunner(superContra);
		gameRunner.run();
	}

}
