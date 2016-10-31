/**
 * Square.java
 * @version Project 3
 * @author Anthony Vuong and Angel De La Torre
 * @version CPE102-05
 * @version Fall 2016
 */


/*
 
a public constant variable named SQUARE_SIZE with a value of 50 
a public constant variable named  UP with a value of 0
a public constant variable named RIGHT with a value of 1
a public constant variable named DOWN with a value of 2
a public constant variable named LEFT with a value of 3

a private variable named WALLS representing an array with a size of 4
a private boolean variable named seen determines if a square has been seen or not
a private boolean variable named inView determines if a square is in view or not
a private integer variable named ROW that represent the rows of a square
a private integer variable named COL that represent the columns of a square
a private Treasure(type) variable named treasure that references a treasure objects within a square

public constructor Square(boolean UP, boolean RIGHT, boolean DOWN, boolean LEFT, Integer ROW, Integer COL)
	set wall[0] to instance UP
	set wall[1] to instance RIGHT
	set wall[2] to instance DOWN
	set wall[3] to instance LEFT
	set parameter ROW to instance ROW
	set parameter COL to instance COL
	
public boolean wall(integer direction)
	return wall[direction]
			
			
public boolean seen()
	return seen
	
public boolean inView()
	return inView
	
public integer row()
	return row
	
public integer col()
	return col
	
public Treasure treasure()
	return treasure
	
public integer x()
	multiply column and SQUARE_SIZE
	
public integer y()
	multiply row and SQUARE_SIZE

public void setInView(boolean inView)
	initialize object's inView to parameter inView
	if inView is equal to true
		then seen is equal to true
	
public void setTreasure(Treasure t)
	set object's treasure to parameter t
	
public void enter()
	if treasure does not equal null
		invoke treasure's setFound method


	
	




*/