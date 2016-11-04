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
	 	Square s = this.location();
	 	s.setTreasure(this);
	 }
	public Treasure(Maze maze, long seed)
	{
		super(maze);
	 	foundTreasure = false;
	 	Square s = this.location();
	 	s.setTreasure(this);
	}
	public Treasure(Maze maze, Square location)
	{
		super(maze);
	 	foundTreasure = false;
	 	Square s = this.location();
	 	s.setTreasure(this);
	}
							  
	public boolean found()
	{ return foundTreasure;}

	public void setFound()
	{ foundTreasure = true;}
	
	public void move(){}
}