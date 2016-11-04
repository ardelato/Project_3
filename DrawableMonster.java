
public class DrawableMonster extends Monster implements Drawable {

	public DrawableMonster(Maze maze) {
		super(maze);
	}
	public DrawableMonster(Maze maze, long seed) {
		super(maze, seed);
	}
	public DrawableMonster(Maze maze, Square Location) {
		super(maze, Location);
	}
	public void draw() {}

}
