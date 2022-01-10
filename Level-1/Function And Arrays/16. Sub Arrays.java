//16. Subarray Problem
// 1. You are given an array of size 'n' and n elements of the same array.
// 2. You are required to find and print all the subarrays of the given array. 

import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i = 0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    
    for(int start = 0; start < n; start++)// Fix starting index
    {
      for(int end = start; end < n; end++)// vary the ending index from start to the n
      {
        for(int i = start; i <=end; i++)// print from starting to end index
        {
          System.out.print(arr[i]+"\t");// print the elements from index start to end
        }
        System.out.println();// after each iteration of printing start and end idx print in new line
      }
    }
  }
}
