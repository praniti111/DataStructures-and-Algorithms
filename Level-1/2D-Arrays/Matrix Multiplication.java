//2. Matrix Multiplication

// 1. You are given a number n1, representing the number of rows of 1st matrix.
// 2. You are given a number m1, representing the number of columns of 1st matrix.
// 3. You are given n1*m1 numbers, representing elements of 2d array a1.
// 4. You are given a number n2, representing the number of rows of 2nd matrix.
// 5. You are given a number m2, representing the number of columns of 2nd matrix.
// 6. You are given n2*m2 numbers, representing elements of 2d array a2.
// 7. If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, display the contents of prd array as specified in output Format.
// 8. If the two arrays can't be multiplied, print "Invalid input".

import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int m1 = sc.nextInt();
    
    int[][] mat1 = new int[n1][m1];
    for(int i=0;i<n1;i++)
    {
      for(int j=0;j<m1;j++)
      {
        mat1[i][j] = sc.nextInt();
      }
    }
    
    int n2 = sc.nextInt();
    int m2 = sc.nextInt();
    int [][] mat2 = new int[n2][m2];
    for(int i=0;i<n2;i++)
    {
      for(int j=0;j<m2;j++)
      {
        mat2[i][j] = sc.nextInt();
      }
    }
    
    if(m1 == n2)//main condition to check if col1 and row2 are equal or not this is the condition for matrix multiplication
    {
      int [][] res = new int[n1][m2];
      for(int i=0;i<res.length;i++)
      {
        for(int j=0;j<res[0].length;j++)
        {
          for(int k = 0;k<n1;k++)
          {
            res[i][j] = res[i][j] + (mat1[i][k]*mat2[k][j]);
          }
          System.out.print(res[i][j]+" ");
        }
        System.out.println();
      }
    }
      else
      {
        System.out.print("Invalid input");
      }
  }
}
