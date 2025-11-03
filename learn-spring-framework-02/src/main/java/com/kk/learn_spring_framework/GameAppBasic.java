package com.kk.learn_spring_framework;

import java.util.Scanner;

import com.kk.learn_spring_framework.game.GameRunner;
import com.kk.learn_spring_framework.game.MarioGame;
import com.kk.learn_spring_framework.game.PacMan;
import com.kk.learn_spring_framework.game.SuperContra;

public class GameAppBasic {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Game Name: ");
		String str = scn.next();
		GameRunner gameRunner = null;
		
		if (str.equalsIgnoreCase("MARIO")) {
			MarioGame game = new MarioGame();
			gameRunner = new GameRunner(game);
		} else if (str.equalsIgnoreCase("SuperContra")) {
			SuperContra game = new SuperContra();
			gameRunner = new GameRunner(game);
		} else if (str.equalsIgnoreCase("PacMan")) {
			PacMan game = new PacMan();
			gameRunner = new GameRunner(game);
		} else {
			System.out.println("No input");
		}
		gameRunner.run();
	}

}
