package disopy.game;

import disopy.game.engine.app.DefaultWindow;
import disopy.game.engine.app.Window;
import disopy.game.engine.app.graphic.Color;
import disopy.game.engine.app.graphic.GL;
import disopy.game.engine.utils.geometry.Point;
import disopy.game.engine.utils.geometry.Quad;

public class TestGame implements Window {
	
	private final DefaultWindow window;
	
	private Quad blueQuad = new Quad(new Point(50, 50), 500, 200);
	private Quad redQuad = new Quad(new Point(200, 300), 20, 40);
	
	public TestGame(int width, int heigth){
		window = new DefaultWindow(width, heigth);
	}
	
	@Override
	public void start() {
		window.start();
		GL.initGL(window.getWidth(), window.getHeigth());
	}
	
	@Override
	public boolean isFinish(){
		return window.isFinish();
	}
	
	@Override
	public void event(double delta) {
		// Move things
		
		int speed = 120; // = 100 pixel/second
		redQuad = redQuad.translate((int)(speed * delta), 0);
		
		window.event(delta);
	}
	
	@Override
	public void update(){
		GL.clear();

		// Display things
		
		GL.drawQuad(Color.BLUE, blueQuad);
		GL.drawQuad(Color.RED, redQuad);
		
		
		window.update();
	}

	@Override
	public void close(){
		window.close();
	}
}
