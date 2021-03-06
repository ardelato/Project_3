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
		super(maze);
	 	foundTreasure = false;
	 	super.location().setTreasure(this);
	 }
	public Treasure(Maze maze, long seed)
	{
		super(maze, seed);
	 	foundTreasure = false;
	 	super.location().setTreasure(this);
	}
	public Treasure(Maze maze, Square location)
	{
		super(maze, location);
	 	foundTreasure = false;
	    location().setTreasure(this);
	 }				  
	public boolean found()
	{ return foundTreasure;}

	public void setFound()
	{ this.foundTreasure = true;}
	
	public void move(){}
}