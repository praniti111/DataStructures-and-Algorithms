//14. Rotate An Array
// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are given a number k.
// 4. Rotate the array a, k times to the right (for positive values of k), and to
// the left for negative values of k.

import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
  
  public static void swap(int[] a, int left, int right)
  {
    int temp = a[left];
    a[left] = a[right];
    a[right] = temp;
  }
  
  public static void reverse(int [] a, int left, int right)
  {
    while(left<right) 
    {
      swap(a,left,right);
      left++;
      right--;
    }
  }

  public static void rotate(int[] a, int k){
    // write your code here
    int n = a.length;
    
    //to handle larger values of k
    k = k%n;
    
    //to handle negative values of k
    if(k<0) 
    {
      k = k+n;
      }
    //individual Reverse the 1st block
    reverse(a,0,n-k-1);
    
    //individual reverse the 2nd block
    reverse(a,n-k,n-1);
    
    //Reverse the total block
    reverse(a,0,n-1);
    
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}
