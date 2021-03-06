public class TestDriver
{
	public static void main(String[] args) {
	  Square[][] mazeSquares = new Square[3][3];
      Maze maze;
      Explorer ex;
      
      /*     -------------
       *     |       |   |
       *     |       |   |
       *     -----   -   |
       *     |   |       |
       *     |   |       |
       *     |   -   -   |
       *     |       |   |
       *     |       |   |
       *     -------------
       */
    
      mazeSquares[0][0] = new Square(true, false, true, true, 0, 0);
      mazeSquares[0][1] = new Square(true, true, false, false, 0, 1);
      mazeSquares[0][2] = new Square(true, true, false, true, 0, 2);
      mazeSquares[1][0] = new Square(true, true, false, true, 1, 0);
      mazeSquares[1][1] = new Square(false, false, false, true, 1, 1);
      mazeSquares[1][2] = new Square(false, false, false, false, 1, 2);
      mazeSquares[2][0] = new Square(false, false, true, true, 2, 0);
      mazeSquares[2][1] = new Square(false, true, true, false, 2, 1);
      mazeSquares[2][2] = new Square(false, true, true, true, 2, 2);
      
      maze = new Maze(mazeSquares, 3, 3);
      ex = new Explorer(mazeSquares[0][0], maze, "Super Chris");

     /* Monster m1 = new Monster(maze);
       Monster m2 = new Monster(maze, 12);
       Monster m3 = new Monster(maze, mazeSquares[1][1]);*/

      System.out.println("explorer at" + ex.location().row() + "," + ex.location().col());

    /*  System.out.println("monster round 1");
      System.out.println(m1.location().row() + "," + m1.location().col());
      System.out.println(m2.location().row() + "," + m2.location().col());
      System.out.println(m3.location().row() + "," + m3.location().col());
      */
      System.out.println(maze.rows() + "," + maze.cols());
    /*  m1.move();
      m2.move();
      m3.move(); */
      //ex.move(Square.UP);
      //System.out.println("explorer at" + ex.location().row() + "," + ex.location().col());
      ex.move(1);
      System.out.println("explorer at" + ex.location().row() + "," + ex.location().col());
      ex.move(2);
      System.out.println("explorer at" + ex.location().row() + "," + ex.location().col());
      ex.move(1);
      System.out.println("explorer at" + ex.location().row() + "," + ex.location().col());
      ex.move(2);
      System.out.println("explorer at" + ex.location().row() + "," + ex.location().col());
      ex.move(2);
      System.out.println("explorer at" + ex.location().row() + "," + ex.location().col());
     // ex.move(Square.DOWN);
      //System.out.println("explorer at" + ex.location().row() + "," + ex.location().col());
     // ex.move(Square.LEFT);
     //   System.out.println("explorer at" + ex.location().row() + "," + ex.location().col());

    /*  System.out.println("monster round 2");
      System.out.println(m1.location().row() + "," + m1.location().col());
      System.out.println(m2.location().row() + "," + m2.location().col());
      System.out.println(m3.location().row() + "," + m3.location().col());*/
	}
}