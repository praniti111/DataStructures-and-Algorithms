/* Code Question 2 

Several satellites provide observational black and white images which are sorted in data centers at Amazon Web Services(AWS)

A black and white image is compoed of pixels and is represented as an (n-m) grid of cells, 
Each pixel can have a value of 0 or 1, where 0 represents a white pixel and 1 represents a black pixel. The greyness of a cell(i,j) is affected by the pixel values
in the ith row and the jth column. More formally, the greyness of the cell(i,j) is the difference between the number of black pixel in the ith row and 
the jth column and the number of white pixels in the ith row and the jth column.

Find the maximum greyness among among all the sells of the grid.
Note: The value of the cell(i,j) is counted both in the ith row and n the jth column.

Eg: 
pixels = ['101','001', '110']

The n*m = 3*3 grid of pixels looks like this: 1 0 1
                                              0 0 1
                                              1 1 0
The greyness of the cell(1,1) is calculted as:
Number of 1s in 1st row = 2               1 0 1
Number of 1s in 1st column = 2            0 0 1
Number of 0s in the 1st row = 1           1 1 0
Number of 0s in the 1st column = 1
Thus,
greyness = (2+2)-(1+1)=2

The greyness of each cell is: 2 0  2
                              0 -2 0
                              2 0  2
                              The maximum achievable greyness is 2
 Function Description 
 Complete the function getMaximumGreyness in the editor below
 getMaximumGreyness has the following parameter:
 string pixels[n]: a grid of pixels, where the ith string consists of m characters and represents the ith row of pixels.
 
 Sample Case 0
 Sample Input for Custom Testing 
 
 STDIN      FUNCTION
 -----      --------
 3      ->  pixels[] size n = 3
 1010   ->  pixels = ["1010", "0101", "1010"]
 0101
 1010
 
 Sample Output
 1
 
 Explanation
 The 3*4 grid looks like this
 1 0 1 0
 0 1 0 1
 1 0 1 0
 
 The greyness of each cell is:
 
 1 -1 1 -1
 1 -1 1 -1
 1 -1 1 -1
  The maximum achievable greyness is 1
  */

import java.util.*;
import java.Scanner;

class Result{
  public static int getMaximumGreyness(List<String> pixels){
    int n = pixels.size();
    int m = pixels.get(0).length();
    int []ones_row = new int [n];
    int []zeros_row = new int[n];
    int []ones_col = new int[m];
    int []zeros_col = new int[m];
    for(int i =0;i<n;i++){
      int ones = 0;
      int zeros = 0;
      for(int j=0;j<m;j++){
        char x = pixels.get(i).charAt(j);
        if(x=='1') ones++;
        else zeros++;
      }
      ones_row[i] = ones;
      zeros_row[i] = zeros;
    }
    for(int i = 0;i<m;i++){
      int ones = 0;
      int zeros = 0;
      for(int j=0;j<n;j++){
        char x=pixels.get(j).charAt(i);
        if(x=='1') ones++;
        else zeros++;
      }
      ones_col[i] = ones;
      zeros_col[i] = zeros;
    }
    int maxi = Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        maxi= Math.max(maxi,(ones_row[i]+ones_col[j])-(zeros_row[i]+zeros_col[j]));
      }
    }
    return maxi;
    
  }
}

public class Solution{}
                              
