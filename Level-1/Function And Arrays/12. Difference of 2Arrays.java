//12. Difference of Two Arrays
//1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

// Assumption - number represented by a2 is greater.

import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n1 = sc.nextInt();
    int[] a1 = new int[n1];
    for(int i=0;i<n1;i++) a1[i] = sc.nextInt();
    
    int n2 = sc.nextInt();
    int[] a2 = new int[n2];
    for(int i=0;i<n2;i++) a2[i] = sc.nextInt();
    
    int[] diff = new int[n2];//given array 2 is greater so the resultant arry length can be taken as n2
    
    int i = a1.length - 1;
    int j = a2.length - 1;
    int k = diff.length - 1;
    int carry = 0;
    
    while(k>=0)
    {
      int d =0;
      int a1v = i >=0? a1[i]:0;// checks if there is element present in that index if true takes the digit else 0
      int a2v = j >=0? a2[j]:0;
      
      if(a2v + carry >= a1v)// checks if a2 + carry is greater than a1 to subtract 
      {
        d = a2v + carry - a1v;
        carry = 0;// carry is 0 as we dont need to borrow a number (condition satisfied)
      }
      else
      {
        d = a2v + carry + 10 - a1v;// add 10 as ther is a borrow taken from the next number with carry -1
        carry = -1;
      }
      
      diff[k] = d;
      i--;
      j--;
      k--;
    }
    //to remove the leading 0's
    int idx = 0;
    while(idx < diff.length)
    {
      if(diff[idx] == 0) idx++;
      else break;
    }
    
    while(idx < diff.length)//To print the result without the leading 0's
    {
      System.out.println(diff[idx]);
      idx++;
    }
    
  }
}
