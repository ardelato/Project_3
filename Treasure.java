/**
 * Treasure.java
 * @version Project 3
 * @author Anthony Vuong and Angel De La Torre
 * @version CPE102-05
 * @version Fall 2016
 */


public class Treasure extends RandomOccupant
{
	private boolean foundTreasure;

	public Treasure(Maze maze)
	{
		Random rand = new Random();
		m = maze; 
		int rows = maze.rows();
		int cols = maze.cols();
	 	int r = rand.nextInt(rows);
	 	int c = rand.nextInt(cols);
	 	Square s = maze.getSquare(r, c);
	 	this.moveTo(s);
	 	foundTreasure = false;
	 	this.setFound();
	 }
	public Treasure(Maze maze, long seed)
	{
		Random rand = new Random();
		m = maze; 
		rand.setSeed(seed);
		int rows = m.rows();
		int cols = m.cols();
		int r = rand.nextInt(rows);
		int c = rand.nextInt(cols);
		Square s = maze.getSquare(r, c);
	 	this.moveTo(s);
 		foundTreasure = false;
 		this.setFound();
	}
	public Treasure(Maze maze, Square location)
	{
		m = maze;
		this.moveTo(location);
		foundTreasure = false;
		this.setFound();
	}
							  
	public boolean found()
	{ return foundTreasure;}

	public void setFound()
	{ foundTreasure = true;}
	
	public void move()
	{ 
		Square s = this.location;
		s = s;
	}
}