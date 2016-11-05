/**
 *@name Explorer.java 
 *
 *@descripiton Explorer class will represent the player occupant for the maze game
 *
 *@author Angel de la Torre, Anthony Vuong
 *
 *@version CPE 102 - 05
 *@version Fall 2016
 *@version 10/28/16
 */
import java.awt.event.KeyEvent;


public class Explorer extends Occupant{
//instance variables
	//a variable to represent the Explorer's name
	/*decalre the privacy use appropiate data type and use the variable name "name"*/
	//a reference to the Maze file that it inhabits
	/*decalre the privacy use the appropiate data type and use a desired variable name.*/
	
	private String name;
	private Maze maze;

//constructor
	//a constructor that takes in a location, a Maze, and a "name" and will call the function lookAround
	/*to do so we will need set the values that it takes in, to the variables we have created but are empty */
	
	public Explorer(Square location, Maze maze, String name){
		super.moveTo(location);
		this.maze = maze;
		this.name = name;
		maze.lookAround(location);
	}

//Method
	//a function to return the "name" of the Explorer
	/* simply return the name variable*/
	public String name(){
		return name;
	}
	//a function to move the Explorer a said direction based on the user's key input
	//the keys pressed must be arrow keys either numpad or non-numpad
	
	public void move(int key){
		//local variables needed to keep track of current row/column
		int current_row = super.location().row();
		int current_col = super.location().col();
			
			//key press that checks if key entered was in UP direction
			if (key == Square.UP){
				if(current_row != 0)
				{
					current_row -= 1;
					if(maze.getSquare(current_row, current_col).wall(Square.DOWN) == false){
						super.moveTo(maze.getSquare(current_row, current_col));
					}
					else{
						this.location();
					}
				}
			}
			
			//key press that checks if key entered was in DOWN direction
			if (key == Square.DOWN){
				if(current_row != (maze.rows() - 1) )
				{
					current_row += 1;
					if(maze.getSquare(current_row, current_col).wall(Square.UP) == false){
					super.moveTo(maze.getSquare(current_row, current_col));
					}
					else{
					this.location();
					}				
				}
			}
				
			
			//key press that checks if key entered was in LEFT direction
			if (key == Square.LEFT){
				if(current_col != 0)
				{
					current_col -= 1;
					if(maze.getSquare(current_row, current_col).wall(Square.RIGHT) == false){
						super.moveTo(maze.getSquare(current_row, current_col));
					}
					else{
						this.location();
					}
				}	
			}
			
			//key press that checks if key entered was in RIGHT direction
			if (key == Square.RIGHT){
				if(current_col != (maze.cols() - 1))
				{	current_col += 1;
					if(maze.getSquare(current_row, current_col).wall(Square.LEFT) == false){
						super.moveTo(maze.getSquare(current_row, current_col));
					}
					else{
						this.location();
					}
				}
			}
		}
		
		
	
	/**
	*	Retrieve the row and column of the current location
	*   Do so by retrieving them from the Square class
	*   if the key pressed is arrow keys do the following, else do nothing
	*	if the arrow is in the up direction
	*		add 50 to the column
	*		check if there is a wall in the up direction using Maze's getSquare(int row, int col)
	*			if there is no wall move to the new square
	*			else do nothing 
	*	if the arrow is in the down direction
	*		subtract 50 to the column
	*		check if there is a wall in the down direction using Maze's getSquare(int row, int col)
	*			if there is no wall move to the new square
	*			else do nothing 
	*	if the arrow is in the left direction
	*		subtract 50 to the row 
	*		check if there is a wall in the left direction using Maze's getSquare(int row, int col)
	*			if there is no wall move to the new square
	*			else do nothing 
	*	if the arrow is in the right direction
	*		add 50 to the row 
	*		check if there is a wall in the right direction using Maze's getSquare(int row, int col)
	*			if there is no wall move to the new square
	*			else do nothing 
	*/
	//function to move the explorer to another Square in the maze
	/*call the function from the parent class so that the child class can use it
	  then call the enter() function to let the new Square know the explorer has entered.
	  finally call the lookAround function so the explorer knows what's in its new surroundings
	  */
	public void move(Square s){
		this.moveTo(s);
		s.enter();
		maze.lookAround(s);
	}
	
}
	  