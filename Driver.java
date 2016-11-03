 public class Driver
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
      mazeSquares[1][2] = new Square(false, true, false, false, 1, 2);
      mazeSquares[2][0] = new Square(false, false, true, true, 2, 0);
      mazeSquares[2][1] = new Square(false, true, true, false, 2, 1);
      mazeSquares[2][2] = new Square(false, true, true, true, 2, 2);
      
      maze = new Maze(mazeSquares, 3, 3);
      ex = new Explorer(mazeSquares[0][0], maze, "Super Chris");
      
      //assertEquals(mazeSquares[0][0], ex.location());
      System.out.println(ex.location());
      /*
      assertEquals("Super Chris", ex.name());
      assertTrue(mazeSquares[0][0].inView());
      assertTrue(mazeSquares[0][1].inView());
      assertFalse(mazeSquares[0][2].inView());
      assertFalse(mazeSquares[1][0].inView());
      assertTrue(mazeSquares[1][1].inView());
      assertFalse(mazeSquares[1][2].inView());
      assertFalse(mazeSquares[2][0].inView());
      assertFalse(mazeSquares[2][1].inView());
      assertFalse(mazeSquares[2][2].inView());
      */
   }
}