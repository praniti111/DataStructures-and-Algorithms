//9. Linear Search Algorithm
// Find Element In An Array
// 1.You are given a number n, representing the size of array a.
// 2.You are given n distinct numbers, representing elements of array a.
// 3. You are given another number d.
// 4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.

import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] arr = new int[n];
    for(int i= 0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    
    int d = sc.nextInt();
    
    int ans = linearSearch(arr,n,d);
    System.out.println(ans);
  }
  
  public static int linearSearch(int[] arr, int n, int d)
  {
    for(int i=0;i<n;i++)// for loop to travese the whole loop
    {
      if(arr[i] == d)// if the value at the index i is equal to the asked value then return the index else return -1
      {
        return i;
      }
    }
    return -1;
  }
}
