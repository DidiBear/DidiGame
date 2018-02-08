package disopy.game.engine.utils.geometry;

public class Quad {
	
	private final Point position;
	private final int width, height;
	
	public Quad(Point position, int width, int heigth){
		this.position = position;
		this.width = width;
		this.height = heigth;
	}

	public Point getPosition(){
		return position;
	}	
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	
	public Quad translate(int dx, int dy){
		Point newPosition = new Point(position.getX() + dx, position.getY() + dy);  
		return new Quad(newPosition, width, height);
	}
}
