package disopy.game;

import disopy.game.engine.app.Application;

public class Main {
	public static void main(String[] args){
		
		TestGame game = new TestGame(800, 600);
		
		new Application(game).run();
		
	}
}
