//3. The State Of Wakanda - 1 || Wave Traversal || Zig-Zag Order
//Input
// 1  2  3
// 4  5  6
// 7  8  9
// is the prescribed route and the visitors travels this path: 1->2->3->4->5->6->7->8->9

//Output
// 1  2  3
// 4  5  6
// 7  8  9
// Path followed by traveler: 1->4->7->8->5->2->3->6->9

// You are required to print the path that this traveler follows to visit all places.

import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int [][] mat = new int[n][m];//Matrix input
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        mat[i][j] = sc.nextInt();
      }
    }
    
    for(int j = 0; j<m; j++)//Col by Col traversal
    {
      if(j%2 == 0)//if the column is an even index then start rows from top to bottom(0 to n-1)
      {
        for(int i=0;i<n;i++)
        {
          System.out.println(mat[i][j]);
        }
      }
      else// if the cols is odd index then start the rows from bottom to top(n-1 to 0)
      {
        for(int i= n-1;i>=0;i--)
        {
        System.out.println(mat[i][j]);
         }
      }
    }
  
  }
}
