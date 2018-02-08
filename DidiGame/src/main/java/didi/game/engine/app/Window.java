package disopy.game.engine.app;

public interface Window {

	void start();

	/** Update the display */
	void update();

	/** Update the event */
	void event(double delta);

	boolean isFinish();

	void close();

}
