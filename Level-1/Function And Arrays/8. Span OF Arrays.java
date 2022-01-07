//8. Span Of Arrays
// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
    {
      arr[i] = sc.nextInt();
    }
    
    int span = max(arr, n) - min(arr, n);
    System.out.println(span);
  }
  
  public static int max(int[] arr, int n)
  {
    int maxv = Integer.MIN_VALUE;//(MINVALUE TO +INFINITY)
    
    for(int i =0;i<n;i++)
    {
      if(arr[i]>maxv)
      {
        maxv = arr[i];
      }
    }
    return maxv;
  }
  
  public static int min(int[] arr, int n)
  {
    int minv = Integer.MAX_VALUE;//(-INFINITY TO MAXVALUE)
    
    for(int i=0;i<n;i++)
    {
      if(arr[i]<minv)
      {
        minv = arr[i];
      }
    }
    return minv;
  }
}
