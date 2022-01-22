//5. Spiral Display
//To print the gieven matrix in spriral form starting from left top in anti-clock wise fashion

import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int [][] mat = new int[n][m];
    for(int i = 0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        mat[i][j] = sc.nextInt();
      }
    }
    
    int frow =0;// initaialize thw pointers firstrow(frow) and firstColumn(fcol) to top left(0,0)
    int fcol = 0;
    int lrow = n-1;//initialoze the pointers lastrow(lrow) to last row = n-1
    int lcol = m-1;//pointer lastcolumn(lcol) to last column = m-1
    
    int count = 0;// TO maintain a count of how many elements have we traversed
    while(count!= n*m)// if there are n rows and m cols then there are n*m elements
    {
      for(int i = frow;i<=lrow;i++)// Traverse in First Col from frow to last row
      {
        System.out.println(mat[i][fcol]);// rows will be in loop in the fcol
        count++;// Increase the count each element is printed
        if(count == n*m)// Corner case if the count reach the end then return 
        {
          return;
        }
      }
      fcol ++;// as the loop traversed in First col then increase the fcol to next(by 1)
    
      for(int j = fcol;j<=lcol;j++)// To travrese Last row from frist col to last col (left to right)
      {
        System.out.println(mat[lrow][j]);
        count++;
        if(count == n*m)
        {
          return;
        }
      }
        lrow --;
        
        for(int i = lrow;i>=frow;i--)// To traverse Last Col from last row to first row(bottom to top)
        {
          System.out.println(mat[i][lcol]);
          count++;
          if(count == n*m)
          {
            return;
          }
        }
        lcol --;
        
        for(int j = lcol;j>=fcol;j--)// To traverse First row from last col to first col(right to left)
        {
          System.out.println(mat[frow][j]);
          count++;
          if(count == n*m)
          {
            return;
          }
        }
      frow++;
    }
  }
}
