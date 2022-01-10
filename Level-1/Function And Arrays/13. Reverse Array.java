//13. Reverse an Array

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to reverse the contents of array a.

//Logic - To swap the first and last elements and left++, right--;
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
  
  public static void swap(int[] a, int left, int right)//function to swap the last and first elements in the array
  {
    int temp = a[left];
    a[left] = a[right];
    a[right] = temp;
  }

  public static void reverse(int[] a){
    //write code here
    int left = 0, right = a.length-1;
    
    while(left<=right)
    {
      swap(a,left,right);
      left++;//update the left pointer by increasing it
      right--;//update the right pointer by decreasing it
    } 
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    reverse(a);
    display(a);
 }

}
