//4. State Of Wakanda-2
//Input:
// 1  2  3
// 4  5  6
// 7  8  9
// is the prescribed route and the visitors travels this path: 1->2->3->4->5->6->7->8->9
//Output:
// 1    2    3    4
// 5    6    7    8
// 9   10  11  12
// 13 14  15  16
// The path followed by the visitor is: 1->6->11->16->2->7->12->3->8->4

import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[][] mat = new int[n][n];//INPUT OF MATRIX
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        mat[i][j] = sc.nextInt();
      }
    }
    
    //This is called GAP strategy used extensively in DP
    //gap=j-i(col-row) this loop will iterate till there are columns present as number of diagonals = number of columns present
    for(int gap=0;gap<n;gap++)
    {
      //Inner loop is used to traverse along the the diagonal to print the elements in the diagonal which requires both rows and cols
      //initialization i=0 and as i=0, j=gap || termination till cols || updation i++ and j++
      for(int i=0,j=gap; j<n; i++,j++)
      {
        System.out.println(mat[i][j]);
      }
    }
    
  }
}
