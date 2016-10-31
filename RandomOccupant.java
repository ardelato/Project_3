/**
 *@name RandomOccupant.java 
 *
 *@descripiton RandomOccupant class - extends from the Occupant class and will
 *be an abstract class that will extend to Monster and Treasure
 *
 *@author Angel de la Torre, Anthony Vuong
 *
 *@version CPE 102 - 05
 *@version Fall 2016
 *@version 10/28/16
 */

public class RandomOccupant extends Occupant{}
//instance variables
	//a variable to use the random function
	//a reference to the Maze file that it inhabits

//constructor
	//a constructor that takes in a maze object. and also sets the object's location
		//to a random location within the maze. 
	//a constructor that takes in a maze object and a seed that will effect the random function
		//the seed will effect the random function in a way to make the random function predictable
	//a constructor that takes in a maze object and a pre-chosen location
		//this will remove the random function and set the object to the chosen location
//methods
	//a function that moves the object to a random location.
	/**
	* Retrieve the row and column of the object's current location
	* Generate a random integer, between 0-3, this integer will represent the numeric
	* 	value of which direction to go.
	* Check to see if the direction is valid, i.e. there are no walls in that given direction
	* if there are no walls, move the object to the new direction
	* else try again until there is a valid direction.
	*/

