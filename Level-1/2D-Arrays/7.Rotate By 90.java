//7. Rotate BY 90
// given n*n numbers, representing elements of 2d array a.
//3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.

import java.io.*;
import java.util.*;

public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] mat = new int[n][n];
    
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        mat[i][j] = sc.nextInt();
      }
    }
  }
}
