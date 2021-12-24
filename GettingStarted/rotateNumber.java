/* 9. Rotate a Number
1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340
   */

import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 562984
    int k = sc.nextInt(); //2
    
    rotateNumber(n,k);
  }
  
  public static void rotateNumber(int n; int k)
  {
    int count = 0;
    int temp = n;
    while(temp!=0)// count the number of digits
    {
      temp = temp/10;
      count++;
    }
    
    k = k%count; //for greater values of k
    if(k<0)// for negative values of k
    {
      k = k+count;
    }
    
    int ans = 0;
    
      for(int i=0;i<=count;i++) //loop till 6
      {
      int v1 = n/((int)Math.pow(10,k));//v1 = 562984/10 raise to 2 = 5629

      int v2 = n%((int)Math.pow(10,k));//v2 = 562984%10 raise to 2 = 84

      ans = (v2 * ((int)Math.pow(10,count-k))) + v1; //ans = 84*10 raise to (6-2) + 5629

      }
      System.out.print(ans); //840000+5629 = 845629;
    
  }
}
