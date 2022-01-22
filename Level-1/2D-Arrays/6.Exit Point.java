//6. Exit Point
//Consider this array a maze and a player enters from top-left corner in east direction.
// 5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
// 6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.

import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int[][] mat = new int[n][m];
    for(int i = 0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        mat[i][j] = sc.nextInt();
      }
    }
    
    //right =0; down = 1; left=2; up = 3;
    int direction = 0; // To track the direction of the traversing
    int currRow = 0, currCol = 0, prevRow = 0, prevCol = 0;// given start from top left
    
    while(currRow>=0 && currCol >=0 && currRow <n && currCol <m)// Till the traversing is in the matrix
    {
      if(mat[currRow][currCol] == 1)// when the element is 1 turn 90 deg right
      {
        direction = (direction+1)%4; // (0+1)%4 = 1(turn down) || (1+1)%4 = 2(turn left) || (2+1)%4 = 3(turn up) || (4+1)%4 = 0(turn right) || Note it is remainder
      }
      prevRow = currRow;//upadte the prevRow with the current row after every loop
      prevCol = currCol;
      
      if(direction == 0)// if the direction is 1 turn right and upadte the Col by 1
      {
        //right
        currCol++;
      }
      
      if(direction == 1)
      {
        //down
        currRow++;
      }
      
      if(direction == 2)
      {
        //left
        currCol--;
      }
      
      if(direction == 3)
      {
        //up
        currRow--;
      }
    }
    
    System.out.println(prevRow);
    System.out.println(prevCol);
  }
}
