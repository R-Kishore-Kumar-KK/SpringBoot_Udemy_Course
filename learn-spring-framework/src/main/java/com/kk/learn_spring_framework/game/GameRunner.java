package com.kk.learn_spring_framework.game;

public class GameRunner {

	//private MarioGame game;
	//private SuperContra game;
	private GamingConsole game;

	/*public GameRunner(MarioGame game) {
		this.game = game;
	}*/
	
	/*public GameRunner(SuperContra game) {
		this.game = game;
	}*/
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Game Runner Running: " + game);
		game.up();
		game.down();
		game.right();
		game.left();
	}

}
