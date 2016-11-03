/**
 * Treasure.java
 * @version Project 3
 * @author Anthony Vuong and Angel De La Torre
 * @version CPE102-05
 * @version Fall 2016
 */
import java.util.Random;

public class Treasure extends RandomOccupant
{
	private boolean foundTreasure;

	public Treasure(Maze maze){
		super(maze);
	 	foundTreasure = false;
	 	this.setFound(); 
	}
	public Treasure(Maze maze, long seed)
	{
		super(maze, seed);
 		foundTreasure = false;
 		this.setFound();
	}
	public Treasure(Maze maze, Square location)
	{
		super(maze, location);
		foundTreasure = false;
		this.setFound();
	}
							  
	public boolean found()
	{ return foundTreasure;}

	public void setFound()
	{ foundTreasure = true;}
	
	public void move()
	{ 
		Square s = this.location();
		s = s;
	}
}