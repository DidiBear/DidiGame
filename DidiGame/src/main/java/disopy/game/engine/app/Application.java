package disopy.game.engine.app;

import org.lwjgl.Sys;

public class Application implements Runnable {
	private Window window;

	public Application(Window window){
		this.window = window;
	}

	@Override
	public void run(){
		getDelta(); // initialize delta
		
		window.start();
		while (!window.isFinish()) {
			window.event(getDelta());
			window.update();
		}
		window.close();
	}

	/** time at last frame */
	private static double lastFrame;

	/** @return second passed since last frame */
	private static double getDelta(){
		long time = getTime();
		double delta = (double) (time - lastFrame) / 1000.0;
		lastFrame = time;

		return delta;
	}

	/** @return The system time in milliseconds */
	private static long getTime(){
		return (Sys.getTime() * 1000) / Sys.getTimerResolution();
	}
}
