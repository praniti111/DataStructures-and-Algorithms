//1. 2d Arrays
// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a. //output :11 12 13 14
                                                                                //21 22 23 24

import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    
    int[][] arr = new int[n][m];
    for(int i= 0;i<rows;i++)
    {
      for(int j = 0;j<cols;j++)
      {
        arr[i][j] = sc.nextInt();
      }
    }
    
    for(int i=0;i<rows;i++)
    {
      for(int j=0;j<cols;j++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}
